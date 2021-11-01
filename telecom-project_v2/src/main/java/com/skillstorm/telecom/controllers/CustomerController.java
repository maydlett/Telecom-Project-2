package com.skillstorm.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.services.CustomerService;
import com.skillstorm.telecom.beans.Customer;

@RestController
@RequestMapping("customers")
@CrossOrigin("http://localhost:4200")
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@GetMapping
	public ResponseEntity<List<Customer>> findAll() {
		
		List<Customer> allCustomers = service.findAll();
		
		return new ResponseEntity<>(allCustomers, HttpStatus.OK);
	}
	
	@PostMapping("user")	
	public ResponseEntity<Customer> save(@RequestBody Customer customer) {
		System.out.println("save() " + customer);
		
		Customer newUser = service.save(customer);
		
		return new ResponseEntity<>(newUser, HttpStatus.CREATED); 
	}
	
}
