package com.controller;

import com.model.User;
import com.service.UserService;
import com.tools.CtxUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@ResponseBody
@Api(tags = "测试接口",description = "测试文档说明")
public class UserController {
    private static Logger log = LoggerFactory.getLogger(UserController.class);
    private UserService userService = CtxUtil.getBean(UserService.class);


    @RequestMapping(value="/test", method= RequestMethod.GET)
    @ApiOperation(value = "查询id为1的人员")
    @ApiImplicitParam(name = "userName",value="姓名",dataType="String",paramType = "query")
    @ApiResponse(response = UserController.class,code=200,message = "返回对象参数")
    public void test(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.printf("Successfully 2019 \n");
        User user = userService.select(1);
        System.out.println(user.toString());
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Hello " + request.getParameter("name"));
        out.flush();
    }


}
