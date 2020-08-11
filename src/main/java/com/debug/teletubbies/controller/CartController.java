package com.debug.teletubbies.controller;

import com.debug.teletubbies.po.Cart;
import com.debug.teletubbies.service.CartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "CartController", description = "购物车管理")
@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;

	@ApiOperation("列出购物车")
	@RequestMapping(value = "/listCart", method = RequestMethod.GET)
	public List<Cart> listCart(Cart cart) throws Exception{
		return cartService.listCart(cart);
	}

	@ApiOperation(value = "保存购物车")
	@RequestMapping(value = "/saveCart", method = RequestMethod.POST)
	public int saveCart(Cart cart) throws Exception{
		return cartService.saveCart(cart);
	}

	@ApiOperation("更新购物车")
	@RequestMapping(value = "/updateCart", method = RequestMethod.POST)
	public int updateCart(Cart cart) throws Exception{
		return cartService.updateCart(cart);
	}

	@ApiOperation(value = "移出购物车")
	@RequestMapping(value = "/removeCart", method = RequestMethod.POST)
	public int removeCart(Cart cart) throws Exception{
		return cartService.removeCart(cart);
	}
	
}
