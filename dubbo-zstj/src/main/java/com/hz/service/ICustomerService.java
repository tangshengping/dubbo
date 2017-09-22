package com.hz.service;

import java.util.List;
import java.util.Map;

import com.hz.bean.Customer;

public interface ICustomerService {

    public Customer selectid(int id);


    public boolean insertCustomer(String name,int age);

    @SuppressWarnings("rawtypes")
	public List<Map> select(int id);

    public Customer selectCustomerById(int id);

}
