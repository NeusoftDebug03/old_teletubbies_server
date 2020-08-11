package com.debug.teletubbies.mapper;

import com.debug.teletubbies.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
     List<User> selectUserList();

     User selectUserByID(String id);

     User selectUserByName(String name);

     List<User> selectUserBySex(Integer sex);

     // 用户登录
     User getUserByNameAndPassword(User user);

     // 用户是否存在
     Integer userIsExist(User user);

     // 添加用户
     int insertUser(User user);
}