package com.debug.teletubbies.service.impl;

import com.debug.teletubbies.service.FoodService;
import com.debug.teletubbies.mapper.FoodMapper;
import com.debug.teletubbies.po.Food;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    @Resource
    private FoodMapper foodMapper;
    @Override
    public List<Food> selectFoodList() {
        return foodMapper.selectFoodList();
    }
}
