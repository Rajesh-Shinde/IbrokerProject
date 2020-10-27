package com.example.HBrokers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HBrokers.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
  
}
