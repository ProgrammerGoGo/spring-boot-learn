package com.programmer.springboot.config;

import com.programmer.springboot.model.Student;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author programmerGoGo
 * @Description
 */
@Configuration
public class AppConfig {

    @Bean
    public Student student(){
        return new Student();
    }
}
