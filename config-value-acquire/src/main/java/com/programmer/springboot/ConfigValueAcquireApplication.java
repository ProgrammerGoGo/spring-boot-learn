package com.programmer.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class ConfigValueAcquireApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigValueAcquireApplication.class, args);
    }

}
