package com.programmer.springboot.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
//    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello() {
        return "hello";
    }
}
