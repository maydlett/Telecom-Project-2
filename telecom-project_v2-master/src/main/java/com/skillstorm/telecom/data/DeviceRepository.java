package com.skillstorm.telecom.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skillstorm.telecom.beans.Device;

/**
 * Device Repo
 * @author Matthew, Edrick, Hieu
 *
 */
@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer>{

	/**
	 * GET all by plan id
	 * @param planId
	 * @return
	 */
	@Query(value = "select * from devices where plan_id = ?", nativeQuery = true)	
	public List<Device> findByPlan(int planId);
	
	/**
	 * DELETE by device name
	 * @param name
	 */
	@Modifying
    @Transactional
	@Query(value = "delete from devices where devices.device_name = ?", nativeQuery = true)	
	public void delete(@Param("name") String name);
	
}
