package com.dxl.seckillsystem;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@MapperScan(basePackages = "com.dxl.seckillsystem.mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class SeckillSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillSystemApplication.class, args);
    }

    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }

}
