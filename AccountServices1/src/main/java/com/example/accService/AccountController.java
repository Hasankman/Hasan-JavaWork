package com.example.accService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {
	@Autowired
	MainService service;
	
	@PostMapping("/create")
	public ResponseEntity<Account> create(@RequestBody Account film) {
		return new ResponseEntity<>(this.service.create(film),HttpStatus.CREATED);
	}
	@GetMapping("/readAll")
	public ResponseEntity<List<Account>> read() {
		return ResponseEntity.ok(this.service.readAll());
	}
	
	@GetMapping("/readOne/{id}")
	public ResponseEntity<Optional<Account>> readId(@PathVariable Long id) {
		return ResponseEntity.ok(this.service.readOne(id));
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Account> update(@RequestBody Account acc,@PathVariable Long id) {
		return new ResponseEntity<>(this.service.update(acc, id), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		return ResponseEntity.ok(this.service.delete(id));
	}
	
}
