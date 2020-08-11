package com.debug.teletubbies.controller;

import com.debug.teletubbies.po.Orders;
import com.debug.teletubbies.service.OrdersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "OrdersController", description = "订单管理")
@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    //需要传递三个参数：userId,businessId,daId
    @ApiOperation("生成订单")
    @RequestMapping(value = "/createOrders", method = RequestMethod.POST)
    public int createOrders(Orders orders) throws Exception{
        return ordersService.createOrders(orders);
    }

    @ApiOperation("根据ID查询订单")
    @RequestMapping(value = "/getOrdersById", method = RequestMethod.POST)
    public Orders getOrdersById(Orders orders) throws Exception{
        return ordersService.getOrdersById(orders.getOrderId());
    }

    @ApiOperation(value = "查询用户全部订单")
    @RequestMapping(value = "/listOrdersByUserId", method = RequestMethod.POST)
    public List<Orders> listOrdersByUserId(Orders orders) throws Exception{
        return ordersService.listOrdersByUserId(orders.getUserId());
    }

}
