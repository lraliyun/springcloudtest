package com.hae502.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 本服务启动后会根据配置的yml注册进EurekaServer中
@EnableDiscoveryClient
public class DeptProviderApp8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApp8003.class, args);
    }
}
