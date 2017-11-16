package com.springboot.controller;

import com.springboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zhu on 2017/7/20.
 */
@RestController
public class HelloWord {
    @Resource
    private Student student;
    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String sayHello(){
        return student.getAge();
    }
}
