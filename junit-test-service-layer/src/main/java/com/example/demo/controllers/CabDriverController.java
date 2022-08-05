package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;

@RestController
@RequestMapping(path="/api/v1/drivers")
@CrossOrigin(origins="*")
public class CabDriverController {
	
	@Autowired
	private CabDriverService service;
	
	@Value("${server.port}")
	private String port;
	
	@PostMapping
	public ResponseEntity<Object> add(@RequestBody CabDriver entity) {
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);	
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
