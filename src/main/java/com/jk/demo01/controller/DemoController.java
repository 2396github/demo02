package com.jk.demo01.controller;

import com.jk.demo01.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("aaa")
public class DemoController {
@Autowired
    QueryService queryService;


    @RequestMapping("bbb")
    @ResponseBody
    public String getdemo(Integer id){
        return queryService.getquery(id);
    }

}
