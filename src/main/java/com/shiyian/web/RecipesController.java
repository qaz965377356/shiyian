package com.shiyian.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shiyian.entity.FoodClass;
import com.shiyian.mapper.FoodClassMapper;
import com.shiyian.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/recipes")
public class RecipesController {
    @Autowired
    private FoodService foodService;
    @RequestMapping("ingredients")
    public String ingredients(){
        return "/Recipes/RecipesIngredients";
    }
    @RequestMapping("noun")
    public String noun(){
        List<FoodClass> foodClassList=foodService.findFoodClassList();
        System.out.println(foodClassList);
        return "/Recipes/RecipesNoun";
    }
}