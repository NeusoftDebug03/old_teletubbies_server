package com.debug.teletubbies.controller;

import com.debug.teletubbies.service.FoodService;
import com.debug.teletubbies.po.Food;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "FoodController", description = "食品管理")
@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @ApiOperation("获取全部食品")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Food> getFoodList() {
        return foodService.selectFoodList();
    }
}
