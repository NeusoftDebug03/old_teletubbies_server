package com.debug.teletubbies.mapper;

import com.debug.teletubbies.po.Food;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface FoodMapper {
    List<Food> selectFoodList();
}
