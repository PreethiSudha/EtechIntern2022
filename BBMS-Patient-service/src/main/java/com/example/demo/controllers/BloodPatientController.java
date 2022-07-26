package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BloodPatient;
import com.example.demo.service.BloodPatientService;

@RestController
@RequestMapping(path = "/api/v1/patients")
public class BloodPatientController {

	@Autowired
	private BloodPatientService service;
	
	@PostMapping
	public BloodPatient add(@RequestBody BloodPatient entity ) {
		return this.service.save(entity);	
	}
	
	@GetMapping
	public List<BloodPatient> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path = "/srch/{name}")
	public BloodPatient findByBloodGroup(@PathVariable("name") String name) {
		return service.findByBloodGroup(name);
	}
	
	@GetMapping(path = "/srch/loc/{place}")
	public BloodPatient findByLocation(@PathVariable("place") String place) {
		return service.findByLocation(place);
	}
}
