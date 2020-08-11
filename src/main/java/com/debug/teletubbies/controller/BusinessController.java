package com.debug.teletubbies.controller;

import java.util.List;

import com.debug.teletubbies.po.Business;
import com.debug.teletubbies.service.BusinessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "BusinessController", description = "商家管理")
@RestController
@RequestMapping("/business")
public class BusinessController {
	
	@Autowired
	private BusinessService businessService;

	@ApiOperation("根据商家分类查询商家")
	@RequestMapping(value = "/listBusinessByOrderTypeId", method = RequestMethod.POST)
	/**
	 * 注意点：
	 * 1、使用post请求，如果前端做了参数序列化，那么服务器端就不能使用@RequestBody。
	 * 2、使用post请求，如果前端没做参数序列化，那么就使用@RequestBody，在服务器端做参数序列化处理。
	 * 3、使用post请求，前端传的是序列化的JSON对象，Controller接收时也要使用对象或集合接收。
	 */
	public List<Business> listBusinessByOrderTypeId(Business business) throws Exception{
		return businessService.listBusinessByOrderTypeId(business.getOrderTypeId());
	}

	@ApiOperation("根据商家编号查询商家")
	@RequestMapping(value = "/getBusinessById", method = RequestMethod.POST)
	public Business getBusinessById(Business business) throws Exception{
		return businessService.getBusinessById(business.getBusinessId());
	}
	
}
