package com.shiyian.service;

import com.shiyian.entity.User;

public interface UserService {
    User findUserByName(String username);
    void insertUser(User user);
}
