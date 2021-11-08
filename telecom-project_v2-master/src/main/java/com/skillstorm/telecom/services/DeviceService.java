package com.skillstorm.telecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.skillstorm.telecom.beans.Device;
import com.skillstorm.telecom.data.DeviceRepository;

/**
 * Device Service
 * @author Matthew, Edrick, Hieu
 *
 */
@Service
public class DeviceService {

	//Device Repo
	@Autowired
	DeviceRepository repo;
	
	/**
	 * GET all devices
	 * @return
	 */
	public List<Device> findAll() {
		List<Device> allDevices = repo.findAll();
		return allDevices;
	}
	
	/**
	 * POST a device
	 * @param device
	 * @return
	 */
	public Device save(Device device) {
		Device newDevice = repo.save(device);
		return newDevice;
	}
	
	/**
	 * DELETE a device
	 * @param name
	 */
	public void delete(@Param("name") String name) {
		 repo.delete(name);
	}
	
	/**
	 * GET device by plan id
	 * @param planId
	 * @return
	 */
	public List<Device> findByPlan(int planId) {
		return repo.findByPlan(planId);
	}
		
}
