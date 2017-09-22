package com.hz.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hz.bean.Customer;
import com.hz.dao.CustomerDao;
import com.hz.service.ICustomerService;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService{

	@Resource
	private CustomerDao customerDao;
	
	@Override
	public Customer selectid(int id) {
		return customerDao.selectid(id);
	}

	@Override
	public boolean insertCustomer(String name,int age) {
		return customerDao.insertCustomer(name,age);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<Map> select(int id) {
		return customerDao.select(id);
	}

	@Override
	public Customer selectCustomerById(int id) {
		return customerDao.selectCustomerById(id);
	}

}
