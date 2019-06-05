package com.hae502.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashboardApp9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboardApp9001.class, args);
    }
}
