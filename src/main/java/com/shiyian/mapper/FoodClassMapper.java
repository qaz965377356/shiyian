package com.shiyian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shiyian.entity.Food;
import com.shiyian.entity.FoodClass;
import com.shiyian.entity.vo.FoodAndFoodClass;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FoodClassMapper extends BaseMapper<FoodClass> {
    List<FoodClass> findFoodClassList();
    List<Food> findFoodList();
    List<FoodAndFoodClass> findFoodAndFoodClassList();
}
