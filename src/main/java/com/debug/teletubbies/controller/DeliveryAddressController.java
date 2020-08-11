package com.debug.teletubbies.controller;

import java.util.List;

import com.debug.teletubbies.po.DeliveryAddress;
import com.debug.teletubbies.service.DeliveryAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "DeliveryAddress", description = "收货地址管理")
@RestController
@RequestMapping("/deliveryAddress")
public class DeliveryAddressController {
	
	@Autowired
	private DeliveryAddressService deliveryAddressService;

	@ApiOperation("根据用户名查询收货地址")
	@RequestMapping(value = "/listDeliveryAddressByUserId", method = RequestMethod.POST)
	public List<DeliveryAddress> listDeliveryAddressByUserId(DeliveryAddress deliveryAddress) throws Exception{
		return deliveryAddressService.listDeliveryAddressByUserId(deliveryAddress.getUserId());
	}

	@ApiOperation("保存收货地址")
	@RequestMapping(value = "/saveDeliveryAddress", method = RequestMethod.POST)
	public int saveDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception{
		return deliveryAddressService.saveDeliveryAddress(deliveryAddress);
	}

	@ApiOperation("移出收货地址")
	@RequestMapping(value = "/removeDeliveryAddress", method = RequestMethod.POST)
	public int removeDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception{
		return deliveryAddressService.removeDeliveryAddress(deliveryAddress.getDaId());
	}

	@ApiOperation("根据ID查询收货地址")
	@RequestMapping(value = "/getDeliveryAddressById", method = RequestMethod.POST)
	public DeliveryAddress getDeliveryAddressById(DeliveryAddress deliveryAddress) throws Exception{
		return deliveryAddressService.getDeliveryAddressById(deliveryAddress.getDaId());
	}

	@ApiOperation("更新收货地址")
	@RequestMapping(value = "/updateDeliveryAddress", method = RequestMethod.POST)
	public int updateDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception{
		return deliveryAddressService.updateDeliveryAddress(deliveryAddress);
	}

}
