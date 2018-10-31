package com.shiyian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shiyian.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends BaseMapper<User> {
    User findUserByName(String username);
}
