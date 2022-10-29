package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Responsible for routing user request to expose data
public class MainController { //Simple java class
	List<String> list=new ArrayList<>();

	public MainController() {
		list.add("Turkey");
		list.add("England");
		list.add("France");
		list.add("Germany");
		list.add("Holland");
		list.add("Belgium");
		list.add("Italy");
		list.add("Austria");
		list.add("Hungary");
		list.add("Bulgaria");
		list.add("Romania");
		list.add("Serbia");
		list.add("Syria");
		
	}
	//GET Method
	@GetMapping("/list")
	public List<String> showList() {
		return list;
	}
	//Post Method add to the list
	@PostMapping("/add")
	public List<String> addToList() {
		list.add("Greece");
		list.add("wales");
		return list;
	}
	//PUT Method updates the list
	@PutMapping("/update/{id}")
	public void updateTheList(@PathVariable int id) {
		list.set(id, "Scotland");
	}
	//DELETE removes from the list/deletes a record 
	@DeleteMapping("/delete/{id}")
	public void deleteFromTheList(@PathVariable int id) {
		list.remove(id);
	}
}
