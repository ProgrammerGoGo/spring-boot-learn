package com.programmer.springboot.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author programmerGoGo
 * @Description
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello.";
    }
}
