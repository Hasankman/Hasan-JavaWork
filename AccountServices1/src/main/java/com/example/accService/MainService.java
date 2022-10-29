package com.example.accService;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service //This layer is created to perform some tasks 
public class MainService {
	
	AccountRepository accRepo;
	
	public MainService(AccountRepository accRepo) {
		super();
		this.accRepo = accRepo;
	}
	public Account create(Account acc) //film will be added from POSTMAN Body
	{
		return this.accRepo.save(acc);
	}
	public List<Account> readAll() 
	{
		return this.accRepo.findAll();
	}
	public Optional<Account> readOne(Long id) 
	{
		return this.accRepo.findById(id);
	}
	public Account update(Account film, Long id) 
	{
		Optional<Account> x=this.accRepo.findById(id);
		Account foundacc=x.get();
			foundacc.setAccountnumber(film.getAccountnumber());
			foundacc.setName(film.getName());
			this.accRepo.save(film);
			return foundacc;
	}
	public boolean delete(Long id)
	{
		this.accRepo.deleteById(id);
		return !this.accRepo.existsById(id);
	}
	
	
}
