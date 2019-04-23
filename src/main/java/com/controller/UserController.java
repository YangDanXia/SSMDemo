package com.controller;

import com.model.User;
import com.service.UserService;
import com.tools.CtxUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    private static Logger log = LoggerFactory.getLogger(UserController.class);
    private UserService userService = CtxUtil.getBean(UserService.class);

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }


    @RequestMapping("/test")
    public String jsonTest() {
        System.out.printf("Successfully 2019 \n");
        User user = userService.select(1);
        System.out.println(user.toString());
        return "hello";
    }


}
