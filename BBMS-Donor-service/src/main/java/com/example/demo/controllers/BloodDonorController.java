package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BloodDonor;
import com.example.demo.service.BloodDonorService;

@RestController
@Transactional
@RequestMapping(path = "/api/v1/donors")
public class BloodDonorController {

	@Autowired
	private BloodDonorService service;
	
	@PostMapping
	public BloodDonor add(@RequestBody BloodDonor entity ) {
		return this.service.save(entity);	
	}
	
	@GetMapping
	public List<BloodDonor> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path = "/srch/grp/{name}")
	public BloodDonor[] findByBloodGroup(@PathVariable("name") String name) {
		return service.findByBloodGroup(name);
	}
	
	@GetMapping(path = "/srch/loc/{place}")
	public BloodDonor[] findByLocation(@PathVariable("place") String place) {
		return service.findByLocation(place);
	}
	
	//delete method by using primary key
	@DeleteMapping(path="/srch/mblnum/{mbl}")
	public BloodDonor[] deleteByMobileNumber(@PathVariable("mbl") long mbl) {
		return this.service.removeByMobileNumber(mbl);
	}
	
	//delete method by just a unique property
	@DeleteMapping(path="/srch/Email/{mail}")
	public BloodDonor[] deleteByEmail(@PathVariable ("mail") String email){
		return this.service.deleteByEmail(email);
	}
	
	//reference for using response entity in delete method
//	@DeleteMapping(path="/drivers/{id}")
//	public ResponseEntity<String> deleteById(@PathVariable("id") int id){
//		this.service.removeById(id);
//		return ResponseEntity.ok().body("One Entity Deleted");
//	}
	
//	@PutMapping(path="/update/location/{loc}")
//	public BloodDonor[] updateByLocation(@PathVariable ("loc") String loc) {
//		return this.service.updateByLocation(loc);
//	}
	
	@PutMapping(path="/update/{oldLoc}/{newLoc}")
	public ResponseEntity<String> newLoc(@PathVariable("oldLoc") String oldLoc , 
										@PathVariable("newLoc")String newLoc)
	{
		this.service.newLoc(oldLoc, newLoc);
		return ResponseEntity.status(200).body("One Entity Updated");
	}
	
	
}
