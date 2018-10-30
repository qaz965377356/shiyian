package com.shiyian.service;

import com.shiyian.entity.Food;
import com.shiyian.entity.FoodClass;

import java.util.List;

public interface FoodService {
    List<FoodClass> findFoodClassList();
    Food getFoodById(Integer id);
}
