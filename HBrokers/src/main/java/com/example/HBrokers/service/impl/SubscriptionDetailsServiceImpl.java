package com.example.HBrokers.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HBrokers.model.SubscriptionDetails;
import com.example.HBrokers.repository.SubscriptionDetailsRepository;
import com.example.HBrokers.service.SubscriptionDetailsService;

@Service
public class SubscriptionDetailsServiceImpl implements SubscriptionDetailsService{
	
	@Autowired
	SubscriptionDetailsRepository repo;
	
	public void add(SubscriptionDetails s)
	{
		repo.save(s);
	}
	
	public List<SubscriptionDetails> getAll()
	{
		return repo.findAll();
	}
	
	public SubscriptionDetails getSub(int sid) 
	{
		return repo.findOne(sid);
	}

}
