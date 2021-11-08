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
import com.skillstorm.telecom.services.DeviceService;

/**
 * Device Controller 
 * @author Matthew, Edrick, Hieu
 *
 */
@RestController
@RequestMapping("devices")
@CrossOrigin("https://telecom-angular-eap.azurewebsites.net/")
public class DeviceController {

	//Device service
	@Autowired
	DeviceService service;
	
	/**
	 * GET all devices
	 * @return
	 */
	@GetMapping
	public ResponseEntity<List<Device>> findAll() {
		List<Device> allDevices = service.findAll();
		return new ResponseEntity<>(allDevices, HttpStatus.OK);
	}
	
	/**
	 * POST a device
	 * @param device
	 * @return
	 */
	@PostMapping("add")
	public ResponseEntity<Device> save(@RequestBody Device device) {
		System.out.println("save() " + device);
		Device newDevice = service.save(device);
		return new ResponseEntity<>(newDevice, HttpStatus.CREATED); 		
	}
	
	/**
	 * DELETE a device by name
	 * @param name
	 */
	@DeleteMapping("/{name}")
	public void delete(@PathVariable("name") String name) {
		System.out.println("delete() " + name);
		 service.delete(name);
	}
	
	/**
	 * GET all by plan id
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public ResponseEntity<List<Device>> findByPlan(@PathVariable("id") int id) {
		System.out.println("findByPlan() " + id);
		return new ResponseEntity<List<Device>>(service.findByPlan(id), HttpStatus.OK);
	}
	
}
