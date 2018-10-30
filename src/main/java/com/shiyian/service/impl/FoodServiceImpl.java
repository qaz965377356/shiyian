package com.shiyian.service.impl;

import com.shiyian.entity.Food;
import com.shiyian.entity.FoodClass;
import com.shiyian.entity.vo.FoodAndFoodClass;
import com.shiyian.mapper.FoodClassMapper;
import com.shiyian.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodClassMapper foodClassMapper;
    @Override
    public List<FoodClass> findFoodClassList() {
        List<FoodClass> foodClassResult=foodClassMapper.findFoodClassList();
        List<Food> foodResult=foodClassMapper.findFoodList();
        List<FoodAndFoodClass> facResult=foodClassMapper.findFoodAndFoodClassList();
        Map<String,List<Food>> result=new HashMap<>();
        for(FoodAndFoodClass fafc:facResult){
            for(Food food:foodResult){
                if( fafc.getFoodid()==food.getId()){

                }
            }
            for(FoodClass foodClass:foodClassResult){
                if( fafc.getClassid()==foodClass.getId()){

                }
            }
        }
        return foodClassResult;
    }
}
