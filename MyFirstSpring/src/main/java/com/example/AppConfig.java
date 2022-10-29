package com.example;

import java.time.LocalTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration 
public class AppConfig {
	@Bean
	@Scope("prototype")
    public String greeting() {
        return "Hello, World";
    }
	@Bean
	@Scope("prototype")
    public LocalTime Show() {
        return LocalTime.now();
    }
	@Bean
	@Scope("prototype")
    public Person ShowPerson() {
        return new Person("Hasan", 26);
    }
	@Bean
	@Scope("prototype")
    public Product ShowProduct() {
        return new Product("Phone", "Apple", 1300);
    }
	@Bean
	@Scope("prototype")
    public Book ShowBook() {
        return new Book(101,"Tell me your dreams",121,"Sidney Sheldon",5);
    }

}
