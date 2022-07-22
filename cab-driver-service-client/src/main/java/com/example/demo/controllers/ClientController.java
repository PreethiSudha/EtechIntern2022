 package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.TripDTO;
import com.example.demo.enitity.TripDetail;
import com.example.demo.entity.CabDriver;

@RestController
@RequestMapping(path="/client")
public class ClientController {

	@Autowired
	private RestTemplate template;
	
//	@Autowired
//	private TripDTO dto;
	
	public ClientController(RestTemplate template) {
		super();
		this.template = template;
	}

	@GetMapping(path= "/drivers")
	public String getDrivers() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers", String.class);
		//why we dont use port number or ip address, because 
		//once it gets changed we agaiin go and register the datas with eureka server
		//for omitting that, we use the registeres SERVER-ID  as the url.
	}
	
	@GetMapping(path= "/drivers/json")
	//json is nothing but a string
	public CabDriver[] getDriversAsJson() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers", CabDriver[].class);
	}
	
	@GetMapping(path = "/trips/json")
	public TripDetail[] getTrips() 
	{
		return this.template.getForObject("http://TRIP-SERVICE-DETAILS/api/v1/trips",TripDetail[].class);
	}
	
	@GetMapping(path="/drivers/trips/{id}")
	public String getDriverTrips(@PathVariable("id") int id)
	{
		String driver=this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id, String.class);
		String trips=this.template.getForObject("http://TRIP-SERVICE-DETAILS/api/v1/trips/srch/"+id, String.class);	
		return driver+trips;
	}
	
//	@GetMapping(path = "/drivers/trips/json/{id}")
//	public CabDriver[] getDriverTripsAsJson(@PathVariable("id") int id ) 
//	{
//		CabDriver[] driver=this.template.getForObject("http://cab-driver-service/api/v1/drivers/findById/"+id,CabDriver[].class);
//		TripDetail[] trip= this.template.getForObject("http://trip-detail-service/api/v1/trips/driverId/"+id,TripDetail[].class);
//	    return driver
//	}
	
}
