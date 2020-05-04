package com.yuan.springbootdemo.controller;

import com.yuan.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "api/user")
@RestController
public class UserController {
    @Autowired
    private UserService us;

    @RequestMapping("add")
    public String add(){
        return us.add();
    }

    @RequestMapping("del")
    public String del(){
        return us.del();
    }
}
