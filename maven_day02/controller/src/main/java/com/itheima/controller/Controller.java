package com.itheima.controller;

import com.itheima.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private TestServiceImpl service;

    @RequestMapping("/find")
    public String find() {

        System.out.println("11111");
        return "success.jsp";
    }

    @RequestMapping("/find1")
    public String find1() {
        System.out.println("查询进来了----");
        service.save();
        return "success.jsp";
    }

    @RequestMapping("/find2")
    public String find2() {

        System.out.println("controller 查询");
        service.findAll();
        return "success.jsp";
    }
}
