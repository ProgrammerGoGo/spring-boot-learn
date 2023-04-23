package com.programmer.springboot.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author programmerGoGo
 * @Description  @Value() 获取配置文件中的值赋值给类中的属性
 */
@Component
public class Cat {
    @Value("${cat.name}")
    private String name;
    @Value("#{10*3}")
    private int age;
    @Value("true")
    private boolean b;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", b=" + b +
                '}';
    }
}
