package com.example.Laptops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.Interfaces.Laptop;
import com.example.Interfaces.Storage;

@Component("Apple")
public class Apple implements Laptop {
	@Autowired
	@Qualifier("1 TB")
	Storage str;
	public String spec() {
		System.out.println("This is a Apple Laptop with " + str.spec() + " Storage");
		return str.spec();
	}
}
