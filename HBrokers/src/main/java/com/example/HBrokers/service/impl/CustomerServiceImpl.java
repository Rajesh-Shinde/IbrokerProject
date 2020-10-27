package com.example.HBrokers.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HBrokers.model.Customer;
import com.example.HBrokers.repository.CustomerRepository;
import com.example.HBrokers.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository repo;
	
	public void add(Customer cust)
	{
		repo.save(cust);
	}
	public void remove(int cid)
	{
		repo.delete(cid);
	}
	public Customer findCust(int cid)
	{
		return repo.findOne(cid);
	}
	public List<Customer> getAll()
	{
		return repo.findAll();
	}

}
