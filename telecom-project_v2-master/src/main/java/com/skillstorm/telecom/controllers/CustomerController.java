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

/**
 * Customer Controller 
 * @author Matthew, Edrick, Hieu
 *
 */
@RestController
@RequestMapping("customers")
@CrossOrigin("https://telecom-angular-eap.azurewebsites.net/")
public class CustomerController {

	//Customer service
	@Autowired
	CustomerService service;
	
	/**
	 * GET all users
	 * @return
	 */
	@GetMapping
	public ResponseEntity<List<Customer>> findAll() {
		List<Customer> allCustomers = service.findAll();
		return new ResponseEntity<>(allCustomers, HttpStatus.OK);
	}
	
	/**
	 * POST a user
	 * @param customer
	 * @return
	 */
	@PostMapping("user")	
	public ResponseEntity<Customer> save(@RequestBody Customer customer) {
		Customer newUser = service.save(customer);
		return new ResponseEntity<>(newUser, HttpStatus.CREATED); 
	}
	
}
