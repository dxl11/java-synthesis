package com.dxl.javasynthesisuser;

import com.dxl.javasynthesisuser.util.OpenFeignConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan(basePackages = "com/dxl/javasynthesisuser/mapper")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(defaultConfiguration = OpenFeignConfig.class,basePackages = {"com.dxl.**.feign"})
public class JavaSynthesisUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSynthesisUserApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        RestTemplate restTemplate = builder.build();
        return restTemplate;
    }

}
