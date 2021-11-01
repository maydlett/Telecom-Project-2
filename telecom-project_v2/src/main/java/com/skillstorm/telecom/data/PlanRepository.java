package com.skillstorm.telecom.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skillstorm.telecom.beans.Device;
import com.skillstorm.telecom.beans.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer>{

	@Query(value = "select * from plans, devices where devices.plan_id = ? and plans.plan_id = ?", nativeQuery = true)
	public List<Plan> findTotal(int deviceId, int planId);
	
	
}
