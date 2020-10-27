package com.example.HBrokers.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Plan_details")
@EntityListeners(AuditingEntityListener.class)
public class Plan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	private String pname;
	private int pamt;
	private int pvalidity;
	private double pbrkper;
	public String getPname() {
		return pname;
	}
	public int getPamt() {
		return pamt;
	}
	public int getPvalidity() {
		return pvalidity;
	}
	public double getPbrkper() {
		return pbrkper;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setP_amt(int pamt) {
		this.pamt = pamt;
	}
	public void setPvalidity(int pvalidity) {
		this.pvalidity = pvalidity;
	}
	public void setPbrkper(double pbrkper) {
		this.pbrkper = pbrkper;
	} 
}
