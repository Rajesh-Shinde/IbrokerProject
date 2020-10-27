package com.example.HBrokers.service;

import java.util.List;
import com.example.HBrokers.model.Plan;

public interface PlanService {
	
	public void add(Plan plan);
	public List<Plan> getAll();
	public Plan findPlan(String p_name);

}
