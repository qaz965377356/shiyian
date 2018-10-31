package com.shiyian.web;

import com.shiyian.entity.Food;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/recipes")
    public String recipes(){
        return "/Recipes/Recipes";
    }

    @RequestMapping("/test")
    public String test(){
        return "/UserCenter/login";
    }
}
