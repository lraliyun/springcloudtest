package com.hae502.springcloud;

import com.hae502.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(value = "MICROSERVICECLOUD-DEPT", configuration = MyselfRule.class)
@EnableFeignClients(basePackages = {"com.hae502.springcloud"})
@ComponentScan(value = "com.hae502.springcloud")
public class DeptConsumerFeignApp80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeignApp80.class, args);
    }
}
