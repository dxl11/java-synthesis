package com.dxl.cache.util.redisLock;

import com.dxl.cache.annotation.RedisLock;
import com.dxl.cache.util.JedisPoolUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.lang.reflect.Method;
import java.util.UUID;

/**
 * @Description: redis实现的分布式锁，被注解的方法会执行获取分布式锁的逻辑
 * @Param:
 * @return:
 * @Author: lydms
 * @Date: 2023/6/7
 */
@Aspect
@Component
public class LockMethodAspect {
    @Autowired
    private RedisLockHelper redisLockHelper;
    private Logger logger = LoggerFactory.getLogger(LockMethodAspect.class);

    @Around("@annotation(com.dxl.cache.annotation.RedisLock)")
    public Object around(ProceedingJoinPoint joinPoint) {

        Jedis jedis = JedisPoolUtil.getJedisPoolInstance();

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        RedisLock redisLock = method.getAnnotation(RedisLock.class);
        String value = UUID.randomUUID().toString();

        String key = redisLock.key();
        try {
            final boolean islock = redisLockHelper.lock(jedis, key, value, redisLock.expire(), redisLock.timeUnit());
            logger.info("isLock : {}", islock);
            if (!islock) {
                logger.error("获取锁失败");
                throw new RuntimeException("获取锁失败");
            }
            try {
                return joinPoint.proceed();
            } catch (Throwable throwable) {
                throw new RuntimeException("系统异常");
            }
        } finally {
            logger.info("释放锁");
            redisLockHelper.unlock(jedis, key, value);
            jedis.close();
        }
    }
}

