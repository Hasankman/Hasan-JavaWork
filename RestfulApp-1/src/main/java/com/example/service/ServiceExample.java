package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //Responsible for routing user request to expose data
public class ServiceExample {
		@Autowired
		MainService service;
		
		//GET method
		@GetMapping("/list")
		public List<String> showList()
		{
			return this.service.show();
		}
		//POST add to the list
		@PostMapping("/add")
		public List<String> addToList()
		{
			return this.service.create();
		}
		//PUT update the list
		@PutMapping("/update/{id}")
		public void updateTheList(@PathVariable int id)
		{
			this.service.update(id);
			
		}
		//DELETE deletes a record
		@DeleteMapping("/delete/{id}")
		public void deleteFromTheList(@PathVariable int id)
		{
			this.service.delete(id);
			
		}	
	
	
}
