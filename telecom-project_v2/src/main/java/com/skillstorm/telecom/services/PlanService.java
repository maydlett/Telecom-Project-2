package com.skillstorm.telecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.telecom.data.PlanRepository;

import com.skillstorm.telecom.beans.Plan;

@Service
public class PlanService {

	@Autowired
	PlanRepository repo;
	
	public List<Plan> findAll() {
		List<Plan> allPlans = repo.findAll();
		
		return allPlans;
	}
	
	public Plan save(Plan plan) {
		Plan newPlan = repo.save(plan);
		return newPlan;
	}
	
	public List<Plan> findTotal(int deviceId, int planId) {
		return repo.findTotal(deviceId,planId);
	}

}
