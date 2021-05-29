package com.zhan.service;

import java.util.List;

import com.zhan.model.User;

/**
 * 用户Service接口
 *
 * @author zhanzhan
 * @date 2021/5/21 22:40
 */
public interface UserService {
    /**
     * 查询用户信息
     *
     * @return 用户信息
     */
    List<User> findUserInfo();

}
