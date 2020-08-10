package com.debug.teletubbies.mapper;

import com.debug.teletubbies.po.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface UserMapper {
     List<User> selectUserList();

     User selectUserByID(String id);
}