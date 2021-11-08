package com.skillstorm.telecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.telecom.data.CustomerRepository;

import com.skillstorm.telecom.beans.Customer;

/**
 * Customer Service
 * @author Matthew, Edrick, Hieu
 *
 */
@Service
public class CustomerService {

	//Customer Repo
	@Autowired
	CustomerRepository repo;
	
	/**
	 * GET all customers
	 * @return
	 */
	public List<Customer> findAll() {
		List<Customer> allCustomers = repo.findAll();
		return allCustomers;
	}
	
	/**
	 * POST a customer
	 * @param customer
	 * @return
	 */
	public Customer save(Customer customer) {
		Customer newUser = repo.save(customer);
		return newUser;
	}
	
}
