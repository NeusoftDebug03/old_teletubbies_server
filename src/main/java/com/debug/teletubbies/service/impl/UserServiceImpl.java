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
}
