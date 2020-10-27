package com.letsstartcodingg.springbootrestapiexamplee.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import javax.persistence.Id;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Plan_details")
@EntityListeners(AuditingEntityListener.class)
public class Plan {
	
	@Id
	private long pid;
	private String pname;
	private int pamt;
	private int validity;
	
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public int getPamt() {
		return pamt;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPamt(int pamt) {
		this.pamt = pamt;
	}
	@Override
	public String toString() {
		return "Plan [pname=" + pname + ", pamt=" + pamt + "]";
	}
	
	

}
