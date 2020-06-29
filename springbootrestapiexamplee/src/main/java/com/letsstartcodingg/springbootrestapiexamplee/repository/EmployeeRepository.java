package com.letsstartcodingg.springbootrestapiexamplee.repository;

import com.letsstartcodingg.springbootrestapiexamplee.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}