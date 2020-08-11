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
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public List<User> getUserList() {
        return userService.selectUserList();
    }

    @ApiOperation("根据ID查找用户")
    @RequestMapping(value = "/selectById", method = RequestMethod.POST)
    public User getUserByID(String id) {
        return userService.selectUserByID(id);
    }

    @ApiOperation("根据Name查找用户")
    @RequestMapping(value = "/selectByName", method = RequestMethod.POST)
    public User getUserByName(String name) {
        return userService.selectUserByName(name);
    }

    @ApiOperation("根据性别查找用户")
    @RequestMapping(value = "/selectUserBySex", method = RequestMethod.POST)
    public List<User> getUserBySex(Integer sex) {
        return userService.selectUserBySex(sex);
    }


    @ApiOperation("用户登录")
    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public User getUserByNameAndPassword(User user) {
        return userService.getUserByNameAndPassword(user);
    }

    @ApiOperation("用户是否存在")
    @RequestMapping(value = "/userIsExist", method = RequestMethod.POST)
    public Integer userIsExist(User user) {
        return userService.userIsExist(user);
    }

    @ApiOperation("添加用户")
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public int insertUser(User user) {
        return userService.insertUser(user);
    }

}