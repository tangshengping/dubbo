package com.hz.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hz.bean.City;
import com.hz.service.ICityService;

@Service
public class CityService {
 
    @Reference(version = "1.0.0")
    private ICityService cityrvice;
 
    public City getCityById(int id){
    	return cityrvice.getCityById(id);
    }
}
