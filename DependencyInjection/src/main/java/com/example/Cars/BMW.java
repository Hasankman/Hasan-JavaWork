package com.example.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.Interfaces.Car;
import com.example.Interfaces.Engine;
@Component("BMW") // This generates BMW bean
public class BMW implements Car {
	@Autowired
	@Qualifier("V8")
	Engine eng;
	public String spec() {
		System.out.println("This car is a BMW with a " + eng.spec() + " Engine");
		return eng.spec();
	}
}
