package com.hae502.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DeptSpringcloudZuulApp9527 {
    public static void main(String[] args) {
        SpringApplication.run(DeptSpringcloudZuulApp9527.class, args);
    }
}
