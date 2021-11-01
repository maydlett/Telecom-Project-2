package com.skillstorm.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.beans.Device;
import com.skillstorm.telecom.beans.Plan;
import com.skillstorm.telecom.services.DeviceService;

@RestController
@RequestMapping("devices/v1")
//@CrossOrigin("http://localhost:4200")
public class DeviceController {

	@Autowired
	DeviceService service;
	
	@GetMapping
	public ResponseEntity<List<Device>> findAll() {
		List<Device> allDevices = service.findAll();
		
		return new ResponseEntity<>(allDevices, HttpStatus.OK);
	}
	
	@PostMapping("device")
	public ResponseEntity<Device> save(@RequestBody Device device) {
		System.out.println("save() " + device);
		
		Device newDevice = service.save(device);
		
		return new ResponseEntity<>(newDevice, HttpStatus.CREATED); 		
	}
	
	@GetMapping("{id}")
	public ResponseEntity<List<Device>> findByPlan(@PathVariable int id) {
		System.out.println("findByPlan() " + id);

		return new ResponseEntity<List<Device>>(service.findByPlan(id), HttpStatus.OK);
	}
	
//	@GetMapping("{id1}/{id2}")
//	public ResponseEntity<List<Device>> findTotal(@PathVariable int id1, @PathVariable int id2) {
//		System.out.println("total() " + id1 + " -- " + id2);
//
//		return new ResponseEntity<List<Device>>(service.findTotal(id1,id2), HttpStatus.OK);
//	}
	
}
