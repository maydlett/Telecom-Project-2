package com.skillstorm.telecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.telecom.beans.Device;
import com.skillstorm.telecom.data.DeviceRepository;

@Service
public class DeviceService {

	@Autowired
	DeviceRepository repo;
	
	public List<Device> findAll() {
		List<Device> allDevices = repo.findAll();
		
		return allDevices;
	}
	
	public Device save(Device device) {
		Device newDevice = repo.save(device);
		return newDevice;
	}
	
	public List<Device> findByPlan(int planId) {
		return repo.findByPlan(planId);
	}
	
//	public List<Device> findTotal(int deviceId, int planId) {
//		return repo.findTotal(deviceId,planId);
//	}
	
	
}
