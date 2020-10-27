package com.example.HBrokers.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HBrokers.model.Plan;
import com.example.HBrokers.repository.PlanRepository;
import com.example.HBrokers.service.PlanService;
	
@Service
public class PlanServiceImpl implements PlanService{
	
	@Autowired
	PlanRepository repo;
	
	public void add(Plan plan)
	{
		repo.save(plan);
	}
	
	public List<Plan> getAll()
	{
		return repo.findAll();
	}
	public Plan findPlan(String pname)
	{
		return repo.findByPname(pname);
	}

}
