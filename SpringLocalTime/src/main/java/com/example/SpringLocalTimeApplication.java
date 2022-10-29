package com.example;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringLocalTimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLocalTimeApplication.class, args);
		

		ApplicationContext context = SpringApplication.run(SpringLocalTimeApplication.class, args);

	    Object byName = context.getBean("Show");
	    LocalTime byType = context.getBean(LocalTime.class);
	    LocalTime byBoth = context.getBean("Show", LocalTime.class);

	    System.out.println(byName);
	    System.out.println(byType);
	    System.out.println(byBoth);
	}
	  @Bean
	    public LocalTime Show() {
	        return LocalTime.now();
	    }
	

}
