package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Interfaces.Car;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DependencyInjectionApplication.class, args);
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		Car car1=context.getBean("Audi",Car.class);
		Car car2=context.getBean("BMW",Car.class);
		
		car1.spec();
		car2.spec();
		
		
//		Audi car1=new Audi();
//		BMW car2=new BMW();
//		Car car1=new Audi();
//		Car car2=new BMW();
	}

}
