package com.controller;

import com.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/user")
    public String user(HttpServletRequest request){
        int getId = Integer.parseInt(request.getParameter("id"));
        User user = new User();
        user.setId(getId);
        user.setUserName("Tom");
        log.info(user.toString());
        return "index";
    }
}
