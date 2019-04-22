package com.controller;

import com.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
    private static Logger log = LoggerFactory.getLogger(UserController.class);


    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }


    @RequestMapping("/test")
    @ResponseBody
    public Map jsonTest(HttpServletRequest request) {
        System.out.printf("Successfully \n");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        Map map = new HashMap();
        map.put("id",id);
        map.put("name",name);
        return map;
    }
}
