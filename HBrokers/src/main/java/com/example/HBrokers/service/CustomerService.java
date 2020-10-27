package com.example.HBrokers.service;

import java.util.List;

import com.example.HBrokers.model.Customer;

public interface CustomerService {
	
	public void add(Customer cust);
	public void remove(int c_id);
	public Customer findCust(int c_id);
	public List<Customer> getAll();

}
