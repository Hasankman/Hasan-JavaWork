package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Interfaces.Laptop;

@SpringBootApplication
public class DependencyInjectionLaptopApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DependencyInjectionLaptopApplication.class, args);
		ApplicationContext context = SpringApplication.run(DependencyInjectionLaptopApplication.class, args);
		
		Laptop lt1=context.getBean("DELL", Laptop.class);
		Laptop lt2=context.getBean("Apple", Laptop.class);
		
		lt1.spec();
		lt2.spec();
	}

}
