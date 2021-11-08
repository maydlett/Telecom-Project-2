package com.skillstorm.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.beans.Device;
import com.skillstorm.telecom.beans.Plan;
import com.skillstorm.telecom.services.PlanService;

/**
 * Plan Controller 
 * @author Matthew, Edrick, Hieu
 *
 */
@RestController
@RequestMapping("plans")
@CrossOrigin("https://telecom-angular-eap.azurewebsites.net/")
public class PlanController {

	//Plan service
	@Autowired
	PlanService service;
	
	/**
	 * GET all plans
	 * @return
	 */
	@GetMapping
	public ResponseEntity<List<Plan>> findAll() {
		List<Plan> allPlans = service.findAll();
		
		return new ResponseEntity<>(allPlans, HttpStatus.OK);
	}
	
	/**
	 * POST a plan
	 * @param plan
	 * @return
	 */
	@PostMapping("/cart")
	public ResponseEntity<Plan> save(@RequestBody Plan plan) {
		System.out.println("save() " + plan);
		
		Plan newPlan = service.save(plan);
		
		return new ResponseEntity<>(newPlan, HttpStatus.CREATED); 		
	}
	
	/**
	 * DELETE a plan by id
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		System.out.println("delete() " + id);
		 service.delete(id);
	}
}
