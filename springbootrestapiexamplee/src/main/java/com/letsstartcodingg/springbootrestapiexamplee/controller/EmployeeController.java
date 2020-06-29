package com.letsstartcodingg.springbootrestapiexamplee.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsstartcodingg.springbootrestapiexamplee.dao.EmployeeDAO;
import com.letsstartcodingg.springbootrestapiexamplee.dao.PlanDAO;
import com.letsstartcodingg.springbootrestapiexamplee.model.Employee;
import com.letsstartcodingg.springbootrestapiexamplee.model.Plan;
import com.letsstartcodingg.springbootrestapiexamplee.model.Plandetails;

@RestController
@RequestMapping("/company")
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	@Autowired
	PlanDAO planDAO;
	
	char c_req_typ;
	
	/* to save an employee */
	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee emp) {
		return employeeDAO.save(emp);
	}
	
	/* get all employees */
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeDAO.findAll();
	}
	
	/* get an employee by empid */
	@GetMapping("/notes/{id}")
	public <E> E getEmployeeById(@PathVariable(value="id") Long empid){
		Employee emp=employeeDAO.findOne(empid);
		if(emp==null)
		{
			c_req_typ = 'P';
		}
		else
		{
			c_req_typ = emp.getStatus(); 
		}
		
		if(c_req_typ == 'P')
		{
				List<Plan> p = new ArrayList<Plan>(planDAO.findAll());
				return (E)p;
		}
		else if(c_req_typ == 'S')
		{
			List<Employee> e = new ArrayList<Employee>();
			e.add(emp);
			return (E)e;
		}
		else if(c_req_typ == 'U')
		{
			return (E)"Your request is under process";
		}
		
		List<Employee> e = new ArrayList<Employee>();
		e.add(emp);
		return (E)e;

	}
	
	/* update an employee by empid */
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long empid,@Valid @RequestBody Employee empDetails){
		
		Employee emp=employeeDAO.findOne(empid);
		
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		
		emp.setName(empDetails.getName());
		emp.setDesignation(empDetails.getDesignation());
		emp.setExpertise(empDetails.getExpertise());
		
		Employee updateEmployee=employeeDAO.save(emp);
		return ResponseEntity.ok().body(updateEmployee);
	}
	
	/* delete an employee */
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable(value="id") Long empid){
		Employee emp=employeeDAO.findOne(empid);
	
	if(emp==null) {
		return ResponseEntity.notFound().build();
	}
	
	employeeDAO.delete(emp);
	return ResponseEntity.ok().build();
	}
	
	/* Plan select */
	@GetMapping("/plan/{name}/{id}")
	public Plandetails getPlanDetails(@PathVariable(value="name") String pname, @PathVariable(value="id") Long pid)
	{
		Employee emp=employeeDAO.findOne(pid);
		Plan p = planDAO.findByPname(pname);
		
		Plandetails pd = new Plandetails();
		pd.setEname(emp.getName());
		pd.setDesignation(emp.getDesignation());
		pd.setExpertise(emp.getExpertise());
		pd.setPamt(p.getPamt());
		pd.setPname(emp.getPname());
		return pd;
	}
	
	@PutMapping("/plan/{id}/{pname}/{status}")
	public void setPlanDetails(@PathVariable(value="id") long id, @PathVariable(value="pname") String pname, @PathVariable(value="status") char status)
	{
		Employee emp=employeeDAO.findOne(id);
		if(status == 'S')
		{
			emp.setPname(pname);
			emp.setStatus('S');
		}
		else
		{
			emp.setStatus('F');
		}
		employeeDAO.save(emp);
	}

}
