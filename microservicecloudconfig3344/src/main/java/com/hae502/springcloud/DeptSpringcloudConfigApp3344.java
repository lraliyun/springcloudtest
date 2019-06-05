package com.hae502.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DeptSpringcloudConfigApp3344 {
    public static void main(String[] args) {
        SpringApplication.run(DeptSpringcloudConfigApp3344.class, args);
    }
}
