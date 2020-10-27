package com.example.HBrokers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HBrokers.model.SubscriptionDetails;

@Repository
public interface SubscriptionDetailsRepository extends JpaRepository<SubscriptionDetails,Integer>{

}
