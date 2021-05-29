package com.zhan.mapper;

import java.util.List;

import com.zhan.model.User;

/**
 * 测试用户的Mapper接口
 */
public interface UserMapper {

    /**
     * 查询测试用户的信息
     *
     * @return
     */
    public List<User> findUserInfo();

}
