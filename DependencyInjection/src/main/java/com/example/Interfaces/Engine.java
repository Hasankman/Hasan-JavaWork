package com.example.Interfaces;

import org.springframework.stereotype.Component;

@Component //This generates Engine bean
public interface Engine {
	//public String spec= "V8" ;
	public String spec();
}
