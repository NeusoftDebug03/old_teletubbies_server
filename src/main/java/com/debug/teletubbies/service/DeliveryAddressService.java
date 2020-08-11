package com.debug.teletubbies.service;

import com.debug.teletubbies.po.DeliveryAddress;

import java.util.List;



public interface DeliveryAddressService {

	public List<DeliveryAddress> listDeliveryAddressByUserId(String userId);
	public int saveDeliveryAddress(DeliveryAddress deliveryAddress);
	public int removeDeliveryAddress(Integer daId);
	public DeliveryAddress getDeliveryAddressById(Integer daId);
	public int updateDeliveryAddress(DeliveryAddress deliveryAddress);
}
