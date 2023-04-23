package com.programmer.springboot;

import com.programmer.springboot.model.Cat;
import com.programmer.springboot.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigValueAcquireApplicationTests {

    @Autowired
    private Person person;
    @Autowired
    private Cat cat;

    @Test
    public void testPerson() {
        System.out.println(person);
    }

    @Test
    public void testCat() {
        System.out.println(cat);
    }

}
