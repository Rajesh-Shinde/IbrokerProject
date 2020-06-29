package com.letsstartcodingg.springbootrestapiexamplee.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class Plandetails {
	
	private String pname;
	private int pamt;
	private String ename;
	private String designation;
	private String expertise;
	public String getPname() {
		return pname;
	}
	public int getPamt() {
		return pamt;
	}
	public String getEname() {
		return ename;
	}
	public String getDesignation() {
		return designation;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPamt(int pamt) {
		this.pamt = pamt;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	
	

}
