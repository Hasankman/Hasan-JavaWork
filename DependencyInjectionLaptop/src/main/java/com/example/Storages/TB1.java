package com.example.Storages;

import org.springframework.stereotype.Component;

import com.example.Interfaces.Storage;

@Component("1 TB")
public class TB1 implements Storage {
	public String spec() {
		return "1 TB";
	}
}
