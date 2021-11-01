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
	

}
