package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;

@RestController
@RequestMapping(path="/api/v1/drivers")
public class CabDriverController {
	
	@Autowired
	private CabDriverService service;
	
	@Value("${server.port}")
	private String port;
	
	@PostMapping
	public CabDriver add(@RequestBody CabDriver entity) {
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<CabDriver> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path="/{id}")
	public CabDriver findById(@PathVariable("id")int id) {
		return this.service.findById(id).orElseThrow(()-> new RuntimeException("Element Not Found"));
	}
	
	@GetMapping(path = "/srch/drivers/{driverName}")
	public CabDriver findByDriverName(@PathVariable("driverName") String driverName){
		CabDriver found = this.service.findByDriverName(driverName);
		found.setLocation(found.getLocation()+":"+port);
		return found;
	}
}
