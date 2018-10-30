package com.shiyian.service.impl;

import com.shiyian.entity.Food;
import com.shiyian.entity.FoodClass;
import com.shiyian.entity.vo.FoodAndFoodClass;
import com.shiyian.mapper.FoodClassMapper;
import com.shiyian.mapper.FoodMapper;
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
    @Autowired
    private FoodMapper foodMapper;
    @Override
    public List<FoodClass> findFoodClassList() {
        List<FoodClass> result=foodClassMapper.findFoodList();
        result.forEach(System.out::println);
        return result;
    }

    @Override
    public Food getFoodById(Integer id) {
        Food food=foodMapper.selectById(id);
        return food;
    }
}
