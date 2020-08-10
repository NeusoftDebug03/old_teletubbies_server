package com.debug.teletubbies.service;
import com.debug.teletubbies.po.User;
import java.util.List;

public interface UserService {
    List<User> selectUserList();

    User selectUserByID(String id);

    User selectUserByName(String name);

    User selectUserBySex(Integer sex);

    // 用户登录
    User getUserByNameAndPassword(User user);

}

