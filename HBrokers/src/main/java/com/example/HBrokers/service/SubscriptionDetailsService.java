package com.example.HBrokers.service;

import java.util.List;
import com.example.HBrokers.model.SubscriptionDetails;

public interface SubscriptionDetailsService {

	public void add(SubscriptionDetails s);
	public List<SubscriptionDetails> getAll();
	public SubscriptionDetails getSub(int s_id);
}
