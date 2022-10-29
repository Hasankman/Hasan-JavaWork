package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //maps Class with Table
@Table(name= "QAEmployee") 
public class Employee { //By default the name of the table will be Employee
	private int id;
	private String name;
	private String email;
	private long phone;
	
	@Id //Creates primary key
	//@GeneratedValue //Uses internal algorithm to //Auto generates a primary key 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "Eid") 
	public int getId() {
		return id;
	}
	public void setId(int id) { 
		this.id = id;
	}
	@Column(name= "fullname" , nullable=false) 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name= "emailaddress", unique=true) 
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name= "phonenumber") 
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Employee(int id, String name, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public Employee() {
		super();
	}
	
	
}
