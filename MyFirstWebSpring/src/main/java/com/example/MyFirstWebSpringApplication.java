package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Execution point @SpringBootApplication
//@ComponentScan-- look for the based package--- com.example
//@EnableAutoConfiguration-- auto configure many tools that are embeded in SB app
//@Configuration--all the codes written by the developer, are configured internally

@SpringBootApplication
public class MyFirstWebSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebSpringApplication.class, args);
	}

}
