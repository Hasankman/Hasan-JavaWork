package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigurationExampleApplication {
	
	//To access the HTML file on the web browser use
	// http://localhost:8089/index.html

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationExampleApplication.class, args);
	}

}
