package com.skillstorm.telecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.telecom.data.CustomerRepository;

import com.skillstorm.telecom.beans.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;
	
	public List<Customer> findAll() {
		List<Customer> allCustomers = repo.findAll();
		
		return allCustomers;
	}
	
	public Customer save(Customer customer) {
		Customer newUser = repo.save(customer);
		return newUser;
	}
	
	
}
