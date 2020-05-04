package com.yuan.springbootdemo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String add(){
        return "add is ok";
    }

    public String del(){
        return "delete is success";
    }
}
