package com.hae502.springcloud.controller;

import com.hae502.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/consumer/dept")
public class DeptConsumerController {
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public Boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept", dept, Boolean.class);
    }

    @GetMapping(value = "/{id}")
    public Dept get(@PathVariable(value = "id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/" + id, Dept.class);
    }

    @GetMapping
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept", List.class);
    }

    @GetMapping(value="/discovery")
    public Object discovery()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }
}
