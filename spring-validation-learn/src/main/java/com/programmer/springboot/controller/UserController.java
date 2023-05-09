package com.programmer.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @Author programmerGoGo
 * @Description
 */
@RestController
@Validated
public class UserController {

    /**
     * PathVariable校验
     * 必须在Controller类上标注@Validated注解，并在入参上声明约束注解(如@Min等)。如果校验失败，会抛出 ConstraintViolationException 异常。
     *
     * @param id
     * @return
     */
    @GetMapping("/checkPathVariable/{userId}")
    public String checkPathVariable(@NotNull @Min(value = 22, message = "userId不能小于{value}") @PathVariable("userId") Long id) {
        // 校验通过，才会执行业务逻辑处理
        return id + "";
    }

    /**
     * requestParam校验
     * 必须在Controller类上标注@Validated注解，并在入参上声明约束注解(如@Min等)。如果校验失败，会抛出 ConstraintViolationException 异常。
     *
     * @param id
     * @return
     */
    @GetMapping("/checkRequestParam")
    public String checkRequestParam(@NotNull @Min(value = 22, message = "userId不能小于{value}") @RequestParam("userId") Long id) {
        // 校验通过，才会执行业务逻辑处理
        return id + "";
    }
}
