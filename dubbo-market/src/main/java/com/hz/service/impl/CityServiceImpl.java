package com.hz.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hz.bean.City;
import com.hz.service.ICityService;

@Service(version = "1.0.0")
public class CityServiceImpl implements ICityService{

	@Override
	public City getCityById(int id) {
		City city = new City();
		city.setId(id);
		city.setName("city");
		return city;
	}

}
