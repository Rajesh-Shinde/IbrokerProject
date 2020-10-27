package com.example.HBrokers.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Subscription_details")
@EntityListeners(AuditingEntityListener.class)
public class SubscriptionDetails {
	
	@Id
	private int sid;
	private String sname;
	private String splanname;
	private int splanamt;
	private Date splanstartdt;
	private Date splanenddt;
	private char sstatus;
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public String getSplanname() {
		return splanname;
	}
	public int getSplanamt() {
		return splanamt;
	}
	public Date getSplanstartdt() {
		return splanstartdt;
	}
	public Date getSplanenddt() {
		return splanenddt;
	}
	public char getSstatus() {
		return sstatus;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setSplanname(String splanname) {
		this.splanname = splanname;
	}
	public void setSplanamt(int splanamt) {
		this.splanamt = splanamt;
	}
	public void setSplanstartdt(Date splanstartdt) {
		this.splanstartdt = splanstartdt;
	}
	public void setSplanenddt(Date splanenddt) {
		this.splanenddt = splanenddt;
	}
	public void setSstatus(char sstatus) {
		this.sstatus = sstatus;
	}

}
