package com.hae502.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 本服务启动后会根据配置的yml注册进EurekaServer中
@EnableDiscoveryClient//服务发现
@EnableCircuitBreaker//对hystrix熔断机制的支持
public class DeptProviderHystrixApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrixApp8001.class, args);
    }
}
