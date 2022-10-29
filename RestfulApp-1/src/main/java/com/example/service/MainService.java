package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service //This layer is created to perform some tasks 
public class MainService {
	static List<String> list=new ArrayList<>();
	
	public MainService() {
		list.add("Istanbul");
		list.add("Ankara");
		list.add("Izmir");
		list.add("Adana");
		list.add("Gazi-Antep");
		list.add("Mersin");
	}
	public List<String> show() {
		return list;
	}
	public List<String> create() {
		list.add("Antalya");
		list.add("Denizli");
		return list;
	}
	public void update(int id) {
		 list.set(id, "Bolu");
	}
	public void delete(int id) {
		 list.remove(id);
	}
}
