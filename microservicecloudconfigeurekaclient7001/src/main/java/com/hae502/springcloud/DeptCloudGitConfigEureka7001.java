package com.hae502.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DeptCloudGitConfigEureka7001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptCloudGitConfigEureka7001.class, args);
    }
}
