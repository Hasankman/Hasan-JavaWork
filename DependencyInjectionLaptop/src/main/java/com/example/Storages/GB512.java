package com.example.Storages;

import org.springframework.stereotype.Component;

import com.example.Interfaces.Storage;
@Component("512 GB")
public class GB512 implements Storage {
	public String spec() {
		return "512 GB";
	}
}
