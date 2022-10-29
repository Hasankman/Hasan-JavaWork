package com.example.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.Interfaces.Car;
import com.example.Interfaces.Engine;
@Component("Audi") // This generates Audi bean
public class Audi implements Car{
	@Autowired
	@Qualifier("V6")
	Engine eng;//Declaration 
	//Engine eng=new Engine(); //this is a method of declaring a new memory for eng
	public String spec() {
		System.out.println("This car is a Audi with a " + eng.spec() + " Engine");
		return eng.spec();
	}
}
