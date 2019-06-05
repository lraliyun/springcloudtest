package com.hae502.springcloud.service;

import com.hae502.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
@RequestMapping(value = "/dept")
public interface DeptClientService {
    @PostMapping
    public Boolean add(Dept dept);

    @GetMapping(value = "/{id}")
    public Dept get(@PathVariable(name = "id") Long id);

    @GetMapping
    public List<Dept> list();

    @GetMapping(value = "/discovery")
    public Object discovery();
}
