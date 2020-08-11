package com.debug.teletubbies.mapper;

import com.debug.teletubbies.po.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import java.util.List;

public interface OrdersMapper {

    @Insert("insert into orders(userId,businessId,orderDate,orderTotal,daId,orderState) values(#{userId},#{businessId},#{orderDate},#{orderTotal},#{daId},0)")
    @Options(useGeneratedKeys = true, keyProperty = "orderId", keyColumn = "orderId")
    public int saveOrders(Orders orders);

    /**
     * 1、查询订单信息的同时，还需要查询所属商家信息（多对一）（注意：一个商家一个订单）。
     * 2、查询订单信息的同时，还需要查询所属订单明细信息（一对多）。
     */
    public Orders getOrdersById(Integer orderId);

    public List<Orders> listOrdersByUserId(String userId);
}
