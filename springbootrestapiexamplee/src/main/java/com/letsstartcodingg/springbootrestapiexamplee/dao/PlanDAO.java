package com.letsstartcodingg.springbootrestapiexamplee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcodingg.springbootrestapiexamplee.model.Plan;
import com.letsstartcodingg.springbootrestapiexamplee.repository.PlanRepository;

@Service
public class PlanDAO {
	
	@Autowired
	PlanRepository planRepository;
	
	public List<Plan> findAll(){
		return planRepository.findAll();
	}
	
	public Plan findByPname(String pname)
	{
		return planRepository.findByPname(pname);
	}

}
