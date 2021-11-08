package com.skillstorm.telecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.skillstorm.telecom.data.PlanRepository;

import com.skillstorm.telecom.beans.Plan;

/**
 * Plan Service
 * @author Matthew, Edrick, Hieu
 *
 */
@Service
public class PlanService {

	//Plan Repo
	@Autowired
	PlanRepository repo;
	
	/**
	 * GET all plans
	 * @return
	 */
	public List<Plan> findAll() {
		List<Plan> allPlans = repo.findAll();
		return allPlans;
	}
	
	/**
	 * POST a plan
	 * @param plan
	 * @return
	 */
	public Plan save(Plan plan) {
		Plan newPlan = repo.save(plan);
		return newPlan;
	}
	
	/**
	 * DELETE a plan
	 * @param id
	 */
	public void delete(@Param("id") int id) {
		 repo.delete(id);
	}

}
