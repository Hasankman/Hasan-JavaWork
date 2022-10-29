package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Account.Account;

@Service //This layer is created to perform some tasks 
public class MainService {
	static List<Account> list=new ArrayList<>();
	
	public MainService() {
		list.add(new Account ("123454", 101, "Hasan Kayman"));
		list.add(new Account ("123434", 102, "Ece Kayman"));
		list.add(new Account ("233423", 103, "Helin Kayman"));
		list.add(new Account ("354545", 104, "Tolgay Gunesten"));
		list.add(new Account ("324342", 105, "Baran Kayman"));
		list.add(new Account ("234561", 106, "Burak ince"));
	}
	public List<Account> show() {
		return list;
	}
	public List<Account> create() {
		list.add(new Account ("235543", 107, "Mehmet Bal"));
		list.add(new Account ("354544", 108,"Deniz Aslan"));
		return list;
	}
	public void update(int id) {
		 list.set(id,new Account ("343423", 108, "Bolu"));
	}
	public void delete(int id) {
		 list.remove(id);
	}
}
