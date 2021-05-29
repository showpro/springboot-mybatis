package com.zhan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhan.model.User;
import com.zhan.service.UserService;

/**
 * @author zhanzhan
 * @date 2021/5/21 22:44
 */
//@Controller
@RestController  //当前ctroller方法内，为所有的方法 都添加一个@ResponseBody注解
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    //@ResponseBody
    public List<User> getUserInfo() {
        List<User> user = userService.findUserInfo();
        return user;
    }

}
