package com.zhan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhan.mapper.UserMapper;
import com.zhan.model.User;

/**
 * @author zhanzhan
 * @date 2021/5/21 22:42
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findUserInfo() {
        return userMapper.findUserInfo();
    }
}
