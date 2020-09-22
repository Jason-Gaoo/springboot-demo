package com.jason.service;

import com.jason.pojo.User;

public interface UserService {

    public User queryById(Long id);
    public void saveUser(User user);
}
