package com.example.HBrokers.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Customer_details")
@EntityListeners(AuditingEntityListener.class)
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String cname;
	private String cdesignation;
	private String cphone;
	private String cemail;
	private String caddress;
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public String getCdesignation() {
		return cdesignation;
	}
	public String getCphone() {
		return cphone;
	}
	public String getCemail() {
		return cemail;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setCdesignation(String cdesignation) {
		this.cdesignation = cdesignation;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public void setC_email(String cemail) {
		this.cemail = cemail;
	}
	public void setC_address(String caddress) {
		this.caddress = caddress;
	}
}
