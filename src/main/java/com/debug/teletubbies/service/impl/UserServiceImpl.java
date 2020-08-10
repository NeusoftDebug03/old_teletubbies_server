package com.debug.teletubbies.service.impl;

import com.debug.teletubbies.po.User;
import com.debug.teletubbies.service.UserService;
import com.debug.teletubbies.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }

    @Override
    public User selectUserByID(String id) {
        return userMapper.selectUserByID(id);
    }

    @Override
    public User selectUserByName(String name) {
        return userMapper.selectUserByName(name);
    }

    @Override
    public List<User> selectUserBySex(Integer sex) {
        return userMapper.selectUserBySex(sex);
    }

    // 用户登录
    @Override
    public User getUserByNameAndPassword(User user) {
        return userMapper.getUserByNameAndPassword(user);
    }

    // 用户是否存在
    @Override
    public Integer userIsExist(User user) {
        return userMapper.userIsExist(user);
    }

    // 添加用户
    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }


}
