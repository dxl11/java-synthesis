package com.dxl.seckillsystem.controller;

import io.micrometer.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class RedisLockController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/testLock")
    public void testLock() throws InterruptedException {
        //尝试获取锁，注意这里的lock为键名，123为对应的值
        Boolean lock = stringRedisTemplate.opsForValue().setIfAbsent("lock", "123", 1, TimeUnit.MILLISECONDS);
        if (lock) {
            log.info("成功获取锁");
            //减库存
            String num = stringRedisTemplate.opsForValue().get("num");
            int number = Integer.valueOf(num);

            if (number > 0) {
                TimeUnit.SECONDS.sleep(1);
                number = number-1;
                stringRedisTemplate.opsForValue().set("num", String.valueOf(number));
                log.info(String.valueOf(number));
                //释放锁
                stringRedisTemplate.delete("lock");
            }else {
                log.info("库存清空");
            }
        } else {
            log.info("未获取到锁");
        }
    }
}
