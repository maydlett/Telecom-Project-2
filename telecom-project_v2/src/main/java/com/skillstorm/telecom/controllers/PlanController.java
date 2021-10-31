package com.skillstorm.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.beans.Plan;
import com.skillstorm.telecom.services.PlanService;

@RestController
@RequestMapping("plans/v1")
//@CrossOrigin("http://localhost:4200")
public class PlanController {

	@Autowired
	PlanService service;
	
	@GetMapping
	public ResponseEntity<List<Plan>> findAll() {
		List<Plan> allPlans = service.findAll();
		
		return new ResponseEntity<>(allPlans, HttpStatus.OK);
	}
	
//	{   
//	    "planID" : 7,
//	    "planName" : "awjekwe",
//	    "planPrice" : 455.00,
//	    "planNumLines" : 1,
//	    "customerId" : 1
//	}
	
	@PostMapping("plan")
	public ResponseEntity<Plan> save(@RequestBody Plan plan) {
		System.out.println("save() " + plan);
		
		Plan newPlan = service.save(plan);
		
		return new ResponseEntity<>(newPlan, HttpStatus.CREATED); 		
	}
}