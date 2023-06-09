package com.dxl.seckillsystem.controller;

import com.dxl.cache.util.redissonLock.RedissionUtils;
import org.redisson.api.RedissonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.redisson.config.Config;

import java.util.UUID;

@RestController
@RequestMapping("/redisson")
public class RedissonController {

    @RequestMapping("kill")
    public void kill() {
        Config config = new Config();
        config.useClusterServers()
                //可以用"rediss://"来启用SSL连接
                .addNodeAddress("redis://192.168.67.129:6379")
                .setPassword("199522");
        RedissionUtils redissionUtils = RedissionUtils.getInstance();
        RedissonClient redisson = redissionUtils.getRedisson(config);
        //随机生成一个key，防止锁被其他释放
        UUID uuid = UUID.randomUUID();
        redisson.getLock(uuid.toString());



    }
}
