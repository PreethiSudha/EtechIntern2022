package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.CabDriver;

@RestController
@RequestMapping(path="/client")
public class ClientController {

	@Autowired
	private RestTemplate template;
	
	@GetMapping(path= "/drivers")
	public String getDrivers() {
		return this.template.getForObject("http://CAB_DRIVER_SERVICE/api/v1/drivers", String.class);
		//why we dont use port number or ip address, because 
		//once it gets changed we agaiin go and register the datas with eureka server
		//for omitting that, we use the registeres SERVER-ID  as the url.
	}
	
	@GetMapping(path= "/drivers")
	public CabDriver[] getDriversAsJson() {
		return this.template.getForObject("http://CAB_DRIVER_SERVICE/api/v1/drivers", CabDriver[].class);
	}
	
	@GetMapping(path="/srch/drivers/{name}")
	public String getDriverByName(@PathVariable("name") String name) {
		return this.template.getForObject("http://CAB_DRIVER_SERVICE/api/v1/drivers/srch/"+name, String.class);
	}
	
}
