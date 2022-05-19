package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Passenger;
import com.example.demo.services.PassengerService;

@RestController
@RequestMapping(path="/api/v1")
public class PassengerController {

	private PassengerService service;

	@Autowired
	public PassengerController(PassengerService service) {
		super();
		this.service = service;
	}

//	@PostMapping(path="/Passengers")
//	public Passenger addPassenger(@RequestBody Passenger entity) {
//		return this.service.add(entity);
//	}
	
	@GetMapping(path="/passengers/{passengerName}")
	public List<Passenger> getByPassengerName(@PathVariable("passengerName") String passengerName){
		return this.service.srchByPassengerName(passengerName);
	}
	
//	@GetMapping(path="/TripHistory/{tripdate}")
//	public List<Passenger> getByTripDate(@PathVariable("tripate")DateTimeFormat(iso=)LocalDateTime tripdate) {
//		return this.service.srchByTripDate(tripdate);
//	}
	
	@GetMapping(path = "/passengers/srch/tripDate/{tripListTripDateTime}")
	public List<Passenger> getByTripListTripDateTime(@PathVariable("tripListTripDateTime") 
	@DateTimeFormat(iso=ISO.DATE_TIME) LocalDateTime tripDate){
		return this.service.srchByTripDateTime(tripDate);
	}
	
	
}
