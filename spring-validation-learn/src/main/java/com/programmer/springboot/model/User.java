package com.programmer.springboot.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @Author programmerGoGo
 * @Description
 */
@Data
public class User {

    @NotBlank(message = "名字不能为空")
    private String name;

    @NotNull
    @Min(value = 10,message = "年龄不能小于{value}")
    private Integer age;
}
