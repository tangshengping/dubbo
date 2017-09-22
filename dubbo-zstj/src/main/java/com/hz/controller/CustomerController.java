package com.hz.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hz.bean.Customer;
import com.hz.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Resource
	private ICustomerService customerService;
	
    @SuppressWarnings("rawtypes")
	@RequestMapping("list")
    public void list() {
    	
    	boolean insertCustomer = customerService.insertCustomer("name1",23);
    	System.out.println(insertCustomer);
    	List<Map> select = customerService.select(1);
    	System.out.println(select.get(0).get("name"));
    	Customer selectid = customerService.selectid(1);
    	System.out.println(selectid.getName());
    	Customer selectCustomerById = customerService.selectCustomerById(1);
    	System.out.println(selectCustomerById.getName());
    }
}
