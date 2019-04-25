package com.project.springboot.service;


import com.project.springboot.mappers.UserMapper;
import com.project.springboot.model.User;
import com.project.springboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public int deleteByPrimaryKey(Integer var1) {
        return userMapper.deleteByPrimaryKey(var1);
    }

    @Override
    public int insertSelective(User var1) {
        return userMapper.insertSelective(var1);
    }

    @Override
    public User selectByPrimaryKey(Integer var1) {
        return userMapper.selectByPrimaryKey(var1);
    }
}
