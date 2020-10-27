package com.example.HBrokers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HBrokers.model.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer>{
	
	Plan findByPname(String pname);

}
