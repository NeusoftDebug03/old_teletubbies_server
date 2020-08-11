package com.debug.teletubbies.service;

import java.util.List;

import com.debug.teletubbies.po.Business;

public interface BusinessService {

	public List<Business> listBusinessByOrderTypeId(Integer orderTypeId);

	public Business getBusinessById(Integer businessId);
}
