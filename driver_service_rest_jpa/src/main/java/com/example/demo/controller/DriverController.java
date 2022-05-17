package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.services.DriverService;

@RestController
@RequestMapping(path = "/api/v1")
public class DriverController {

	private DriverService service;

	@Autowired
	public DriverController(DriverService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(path="/drivers/{id}")
	public Driver getDriverById(@PathVariable("id") int id){
		return this.service.findById(id);
	}
	
	@GetMapping(path="/drivers")
	public List<Driver> getAllDrivers(){
		return this.service.findAll();
	}

//	@PostMapping(path="/drivers")
//	public Driver addDriver(@RequestBody Driver entity) {
//		return this.service.add(entity);
//	}
	
	@PostMapping(path="/drivers")
	public ResponseEntity<Driver> addDriver(@RequestBody Driver entity) {
		Driver driver = this.service.add(entity);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()    //http://localhost:8080/drivers
				.path("/{id}")          //http://localhost:8080/drivers/103
				.buildAndExpand(entity.getDriverId())  // http://localhost:8080/drivers/105\7
				.toUri();
		//return ResponseEntity.status(HttpStatus.CREATED).body(driver);
		return ResponseEntity.created(location).body(driver);
	}
	
	//1 using void type
//	@DeleteMapping(path="/drivers/{id}")
//	public void deleteById(@PathVariable("id") int id){
//		this.service.removeById(id);
//	}
	
	//2 using any primitive data type
//	@DeleteMapping(path="/drivers/{id}")
//	public String removeById(@PathVariable("id") int id)
//	{
//		 return this.service.deleteById(id);
//		 
//	}
	
	//3 using ResponseEntity to get any message as the item gets deleted for if-else method
//	    @DeleteMapping(path="/{id}")
//  	public ResponseEntity<String> remove(@PathVariable("id")Driver entity) {
//    	Driver var=this.service.removeById(entity);
//        if (var!=null) {
//        	return  ResponseEntity.status(204).build();
//        }else {
//        	return  ResponseEntity.ok("no record matching");
//        }
	
	//4 using ResponseEntity to get any message as the item gets deleted
	@DeleteMapping(path="/drivers/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") int id){
		this.service.removeById(id);
		return ResponseEntity.ok().body("One Entity Deleted");
	}
	
	
	@GetMapping(path="/drivers/srch/mobile/{mobileNumber}")
	public List<Driver> getDriverByMobileNumber(@PathVariable("mobileNumber") long number){
		return this.service.srchByMobileNumber(number);
	}
	
	@GetMapping(path="/drivers/srch/rating/{rating}")
	public List<Driver> getDriverByRating(@PathVariable("rating") double rating){
		return this.service.srchByMobileNumber(rating);
	}
	
	@PutMapping(path="/drivers/{id}/{updatedRating}")
	public ResponseEntity<String> updatedRating(@PathVariable("id")int id , 
												@PathVariable("updatedRating")double updatedRating){
		this.service.updatedRating(id, updatedRating);
		return ResponseEntity.status(200).body("One Entity Updated");
	}
	
	@GetMapping(path="/drivers/sort/{propName}")
	public List<Driver> getDriverByName(@PathVariable("propName") String propName){
		return this.service.sortedList(propName);	
	}
}




















