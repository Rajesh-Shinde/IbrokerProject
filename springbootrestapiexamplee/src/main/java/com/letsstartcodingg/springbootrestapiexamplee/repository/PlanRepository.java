package com.letsstartcodingg.springbootrestapiexamplee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.letsstartcodingg.springbootrestapiexamplee.model.Plan;

@Repository
public interface PlanRepository extends JpaRepository <Plan, Long>
{
	public Plan findByPname(String pname);
}
