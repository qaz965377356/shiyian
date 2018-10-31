package com.shiyian.web;

import com.shiyian.entity.User;
import com.shiyian.mapper.UserMapper;
import com.shiyian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/loginpage")
    public String login(){
        return "/UserCenter/login";
    }

}
