package com.skillstorm.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.beans.Device;
import com.skillstorm.telecom.beans.Plan;
import com.skillstorm.telecom.services.PlanService;

@RestController
@RequestMapping("plans")
@CrossOrigin("http://localhost:4200")
public class PlanController {

	@Autowired
	PlanService service;
	
	@GetMapping
	public ResponseEntity<List<Plan>> findAll() {
		List<Plan> allPlans = service.findAll();
		
		return new ResponseEntity<>(allPlans, HttpStatus.OK);
	}
	
	@PostMapping("/cart")
	public ResponseEntity<Plan> save(@RequestBody Plan plan) {
		System.out.println("save() " + plan);
		
		Plan newPlan = service.save(plan);
		
		return new ResponseEntity<>(newPlan, HttpStatus.CREATED); 		
	}
	
	@GetMapping("{id1}/{id2}")
	public ResponseEntity<List<Plan>> findTotal(@PathVariable int id1, @PathVariable int id2) {
		System.out.println("total() " + id1 + " -- " + id2);

		return new ResponseEntity<List<Plan>>(service.findTotal(id1,id2), HttpStatus.OK);
	}
}
