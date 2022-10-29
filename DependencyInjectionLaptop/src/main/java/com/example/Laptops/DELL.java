package com.example.Laptops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.Interfaces.Laptop;
import com.example.Interfaces.Storage;

@Component("DELL")
public class DELL implements Laptop {
	@Autowired
	@Qualifier("512 GB")
	Storage str;
	public String spec() {
		System.out.println("This is a DELL Laptop with " + str.spec() + " Storage");
		return str.spec();
	}
}
