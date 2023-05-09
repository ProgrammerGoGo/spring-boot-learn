package com.programmer.springboot.controller;

import com.programmer.springboot.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Author programmerGoGo
 * @Description
 */
@RestController
public class HelloController {

    /**
     * requestBody校验
     * 如果校验失败，会抛出 MethodArgumentNotValidException 异常，Spring默认会将其转为400（Bad Request）请求。
     * 这种情况下，使用@Valid和@Validated都可以。
     *
     * @param user
     * @return
     */
    @PostMapping("checkRequestBody")
    public String checkRequestBody(@Validated @RequestBody User user) {
//    public String checkRequestBody(@Validated @RequestBody User user, BindingResult bindingResult) {
//    public String checkRequestBody(@Valid @RequestBody User user){
//    public String checkRequestBody(@Valid @RequestBody User user, BindingResult bindingResult){
        // 校验通过，才会执行业务逻辑处理
        return user.toString();
    }
}
