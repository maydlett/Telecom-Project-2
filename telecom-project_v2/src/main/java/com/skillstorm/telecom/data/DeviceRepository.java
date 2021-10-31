package com.skillstorm.telecom.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skillstorm.telecom.beans.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer>{

	@Query(value = "select * from devices where plan_id = ?", nativeQuery = true)	
	public List<Device> findByPlan(int planId);
	
	@Query(value = "select * from plans, devices where devices.plan_id = 7 and plans.plan_id = 7", nativeQuery = true)
	public List<Device> findTotal(int deviceId, int planId);

}