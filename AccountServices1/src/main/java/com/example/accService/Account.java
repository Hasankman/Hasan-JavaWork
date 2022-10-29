package com.example.accService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Service;

@Service
@Entity //maps Class with Table
public class Account {
	private String accountnumber;
	private long id;
	private String name;
	
	@Column(nullable=false, unique=true)
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	@Id //Creates primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name= "fullname")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account(String accountnumber, long id, String name) {
		super();
		this.accountnumber = accountnumber;
		this.id = id;
		this.name = name;
	}
	public Account() {
		super();
	}
	
	
}
