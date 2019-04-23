package com.service;

import com.model.User;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserServiceTest {

    static UserService userService;

    @BeforeClass
    public static void before(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService = ctx.getBean(UserService.class);
    }

    @Test
    public void select() {
        User user = userService.select(1);
        System.out.println(user.toString());
    }
}