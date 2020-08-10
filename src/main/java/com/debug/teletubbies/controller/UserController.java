package com.debug.teletubbies.controller;

import com.debug.teletubbies.po.User;
import com.debug.teletubbies.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "UserController", description = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("获取全部用户")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> getUserList(){
        return userService.selectUserList();
    }

    @ApiOperation("根据ID查找用户")
    @RequestMapping(value = "/listById", method = RequestMethod.POST)
    public User getUserByID(String userId) {
        return userService.selectUserByID(userId);
    }
}