package com.skillstorm.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.beans.Device;
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
}
