package com.project.springboot.controller;

import com.project.springboot.model.User;
import com.project.springboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
@Slf4j
@Api(description = "用户controller")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation("添加用户")
    @ResponseBody
    @PostMapping("/addUser")
    public User addUser(User user) {
        userService.insertSelective(user);
        return user;
    }

    @ApiOperation("按照id获取用户信息")
    @ResponseBody
    @GetMapping("/getUserById")
    public User getUserById(Integer userId) {
        log.debug("===============getUserById");
        return userService.selectByPrimaryKey(userId);
    }
}
