package com.shiyian;

import com.shiyian.entity.Food;
import com.shiyian.entity.SysUser;
import com.shiyian.mapper.FoodMapper;
import com.shiyian.mapper.SysUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShiyianApplicationTests {
    @Autowired
    private FoodMapper foodMapper;
    @Autowired
    private SysUserMapper sysUserMapper;
    @Test
    public void test() {
        Food food=new Food();
        food.setId(1);
        food.setName("排骨");
        food.setOthername("排骨");
        food.setHeat(17.21);
        food.setSuitable("爱吃排骨的人");
        food.setFooddetail("1111");
        foodMapper.insert(food);
    }
    @Test
    public void test2(){
        SysUser sysUser=sysUserMapper.findUserByName("xiaosuyuan");
        String pwd = new BCryptPasswordEncoder().encode("20166722");
        System.out.println(sysUser);
        System.out.println(pwd);
    }

}
