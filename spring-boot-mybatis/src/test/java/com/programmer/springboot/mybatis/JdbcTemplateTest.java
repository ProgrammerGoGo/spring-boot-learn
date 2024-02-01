package com.programmer.springboot.mybatis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class JdbcTemplateTest extends SpringBootMybatisApplicationTests {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void contextLoads() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from user");
        System.out.println(maps);
    }

}
