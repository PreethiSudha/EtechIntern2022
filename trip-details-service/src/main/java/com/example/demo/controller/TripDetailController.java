package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.TripDetail;
import com.example.demo.service.TripDetailService;

@RestController
@RequestMapping(path="/api/v1/trips")
public class TripDetailController {

	@Autowired
	private TripDetailService service;
	
	public TripDetailController(TripDetailService service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public TripDetail add(@RequestBody TripDetail entity) {
		return this.service.save(entity);
	}

	@GetMapping
	public List<TripDetail> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(value = "/srch/{id}")
	public TripDetail findByDriverId(@PathVariable("id") int id)
	{
		return this.service.findByDriverId(id);
	}
	
	
//	@DeleteMapping(path="/srch/{tripId}")
//	public void deleteById(@PathVariable("tripId") int tripId) {
//		return this.service.removeById(tripId).orElseThrow(()-> new RuntimeException("Element Not Found"));
//	}
	
}
