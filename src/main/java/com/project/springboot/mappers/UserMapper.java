package com.project.springboot.mappers;

import com.project.springboot.model.User;

public interface UserMapper {

    int deleteByPrimaryKey(Integer var1);

    int insertSelective(User var1);

    User selectByPrimaryKey(Integer var1);

}
