package com.dxl.javasynthesisuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan(basePackages = "com/dxl/javasynthesisuser/mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class JavaSynthesisUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSynthesisUserApplication.class, args);
    }

}
