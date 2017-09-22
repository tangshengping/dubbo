package com.hz.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hz.bean.City;
import com.hz.service.impl.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	@Resource CityService cityService;
	
    @RequestMapping("get")
    public City getCityById() {
    	City city = cityService.getCityById(1);
		return city;
    }

}
