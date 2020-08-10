package com.debug.teletubbies.service;
import com.debug.teletubbies.po.User;
import java.util.List;
public interface UserService {
    List<User> selectUserList();

    User selectUserByID(String id);
}

