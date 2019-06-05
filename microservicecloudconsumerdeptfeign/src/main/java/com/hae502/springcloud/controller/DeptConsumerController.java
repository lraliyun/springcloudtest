package com.hae502.springcloud.controller;

import com.hae502.springcloud.service.DeptClientService;
import com.hae502.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/consumer/dept")
public class DeptConsumerController {

    @Autowired
    private DeptClientService deptClientService;

    @PostMapping
    public Boolean add(Dept dept) {
        return deptClientService.add(dept);
    }

    @GetMapping(value = "/{id}")
    public Dept get(@PathVariable(value = "id") Long id) {
        return deptClientService.get(id);
    }

    @GetMapping
    public List<Dept> list() {
        return deptClientService.list();
    }

    @GetMapping(value="/discovery")
    public Object discovery()
    {
        return deptClientService.discovery();
    }
}
