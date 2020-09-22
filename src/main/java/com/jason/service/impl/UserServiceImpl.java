package com.jason.service.impl;

import com.jason.mapper.UserMapper;
import com.jason.pojo.User;
import com.jason.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }


    @Transactional
    @Override
    public void saveUser(User user){
        System.out.println("新增用户...");
        userMapper.insertSelective(user);
    }

}
