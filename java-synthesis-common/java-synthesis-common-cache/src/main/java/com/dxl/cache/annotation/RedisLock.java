package com.dxl.cache.annotation;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * @Description: 自定义一个注解，被注解的方法会执行获取分布式锁的逻辑
 * @Param:
 * @return:
 * @Author: lydms
 * @Date: 2023/6/7
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface RedisLock {
    /**
     * 业务键
     *
     * @return
     */
    String key();

    /**
     * 锁的过期秒数,默认是5秒
     *
     * @return
     */
    int expire() default 5;

    /**
     * 尝试加锁，最多等待时间
     *
     * @return
     */
    long waitTime() default Long.MIN_VALUE;

    /**
     * 锁的超时时间单位
     *
     * @return
     */
    TimeUnit timeUnit() default TimeUnit.SECONDS;
}

