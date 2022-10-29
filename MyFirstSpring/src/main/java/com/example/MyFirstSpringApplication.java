package com.example;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

//Don't need below when app separate.
//@SpringBootApplication
public class MyFirstSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MyFirstSpringApplication.class, args);
		
		//when separate must change the class to where the app is.
		//ApplicationContext context = SpringApplication.run(MyFirstSpringApplication.class, args);

		ApplicationContext context = SpringApplication.run(AppConfig.class, args);
//		Object byName = context.getBean("greeting");
//	    String byType = context.getBean(String.class);
//	    String byBoth = context.getBean("greeting", String.class);
		Object byName = context.getBean("Show");
	    LocalTime byType = context.getBean(LocalTime.class);
	    LocalTime byBoth = context.getBean("Show", LocalTime.class);
   
	    Object byName1 = context.getBean("ShowPerson");
	    Person byType1 = context.getBean(Person.class);
	    Person byBoth1 = context.getBean("ShowPerson", Person.class);

	    Object byName2 = context.getBean("ShowProduct");
	    Product byType2 = context.getBean(Product.class);
	    Product byBoth2 = context.getBean("ShowProduct", Product.class);
	    
	    Object byName3 = context.getBean("ShowBook");
	    Book byType3 = context.getBean(Book.class);
	    Book byBoth3 = context.getBean("ShowBook", Book.class);
	    
	    System.out.println(byName);
	    System.out.println(byType);
	    System.out.println(byBoth);
	    
	    System.out.println(byName1);
	    System.out.println(byType1);
	    System.out.println(byBoth1);
	    
	    System.out.println(byName2);
	    System.out.println(byType2);
	    System.out.println(byBoth2);
	    
	    System.out.println(byName3);
	    System.out.println(byType3);
	    System.out.println(byBoth3);

	}
	//Prefferd method will be on a sepret app
//	  @Bean
//	    public String greeting() {
//	        return "Hello, World";
//	    }
}
