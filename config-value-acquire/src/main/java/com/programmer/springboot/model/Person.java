package com.programmer.springboot.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author programmerGoGo
 * @Description 将配置文件中配置的每一个属性的值，映射到这个组件中
 *
 * @ConfigurationProperties 告诉spring将类中所有属性和配置文件中的相关配置绑定
 * <p>
 * 注意只有容器中的组件才能使用容器提供的功能，所以加 @Component
 */
@Component
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {
//    @Email
    private String name;
    private int age;
    private Date birth;
    private List<Integer> list;
    private Map<String, String> map;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", list=" + list +
                ", map=" + map +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
