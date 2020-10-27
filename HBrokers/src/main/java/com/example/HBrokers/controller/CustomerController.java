package com.example.HBrokers.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HBrokers.model.Customer;
import com.example.HBrokers.model.Plan;
import com.example.HBrokers.model.SubscriptionDetails;
import com.example.HBrokers.service.CustomerService;
import com.example.HBrokers.service.PlanService;
import com.example.HBrokers.service.SubscriptionDetailsService;

@RestController
@RequestMapping("/hbrokers")
public class CustomerController {
	
	@Autowired 
	PlanService service;
	
	@Autowired
	CustomerService cust_service;
	
	@Autowired
	SubscriptionDetailsService sub_service;
	
	/* Add Plans */
	@PostMapping("/Plans")
	public String add(@RequestBody Plan plan)
	{
		service.add(plan);
		return "Plan added succesfully";
	}
	
	/* View Plans */
	@GetMapping("/Plans")
	public List<Plan> add()
	{
		return service.getAll();
	}
	
	/* Add customers */
	@PostMapping("/customers")
	public String add(@RequestBody Customer cust)
	{
		cust_service.add(cust);
		return "Customer added succesfully";
	}
	
	@GetMapping("/getstatus/{id}")
	public <E> E getSubscriptionDetails(@PathVariable(value="id") int sid) 
	{
		SubscriptionDetails s = sub_service.getSub(sid);
		
		if(s == null)
		{
			List<Plan> plan= new ArrayList<Plan>(service.getAll());
			return (E)plan;
		}
		else
		{
			return (E)s;
		}
	}

	@PostMapping("/setPlan/{amt}/{name}/{id}")
	public void setPlan(@PathVariable (value="amt") int pamt, @PathVariable (value="name") String pname, @PathVariable (value="id") int sid)
	{	
		Plan p= service.findPlan(pname);
		Customer c= cust_service.findCust(sid);
		int validity = p.getPvalidity();
		
		Calendar startdt = Calendar.getInstance();
		startdt.setTime(new Date());
		
		Calendar enddt = Calendar.getInstance();
		enddt.setTime(new Date());
		enddt.add(Calendar.DATE, p.getPvalidity());
		
		SubscriptionDetails sd = new SubscriptionDetails();
		sd.setSid(sid);
		sd.setSname(c.getCname());
		sd.setSplanname(pname);
		sd.setSplanamt(pamt);
		sd.setSplanstartdt(startdt.getTime());
		sd.setSplanenddt(enddt.getTime());
		sd.setSstatus('S');
		
		sub_service.add(sd);
	}

}
