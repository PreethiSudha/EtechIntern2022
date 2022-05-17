package com.example.demo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.services.PassengerService;

@Controller
public class PassengerController {

	private PassengerService service;

	@Autowired
	public PassengerController(PassengerService service) {
		super();
		this.service = service;
	}

	@PostMapping(path="/Passengers")
	public Passenger addPassenger(@RequestBody Passenger entity) {
		return this.service.add(entity);
	}
	
	@GetMapping(path="/Passengers/{name}")
	public List<Passenger> getByPassengerName(@PathVariable("name")String passengername){
		return this.service.srchByPassengerName(passengername);
	}
	
	@GetMapping(path="/TripHistory/{tripdate}")
	public List<TripHistory> getByTripDate(@PathVariable("tripate")LocalDate tripdate) {
		return this.service.srchByTripDate(tripdate);
	}
	
	
}
