package com.project.springboot.service;

import com.project.springboot.model.User;

public interface UserService {

    int deleteByPrimaryKey(Integer var1);

    int insertSelective(User var1);

    User selectByPrimaryKey(Integer var1);
}
