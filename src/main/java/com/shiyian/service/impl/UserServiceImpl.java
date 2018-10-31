package com.shiyian.service.impl;

import com.shiyian.entity.User;
import com.shiyian.mapper.UserMapper;
import com.shiyian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUserByName(String username) {
        User user=userMapper.findUserByName(username);
        return user;
    }

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

}
