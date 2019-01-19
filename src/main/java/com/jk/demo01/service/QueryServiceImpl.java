package com.jk.demo01.service;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class QueryServiceImpl implements QueryService {
    @Reference
    DemoService demoService;


    public String getquery(Integer id) {

        return demoService.getdemo(id);
    }
}
