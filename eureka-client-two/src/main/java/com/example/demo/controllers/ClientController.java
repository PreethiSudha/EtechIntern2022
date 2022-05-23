package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path="/api/v1")
public class ClientController {
 
	private RestTemplate template;
	
	private String baseURL = "http://CLIENT-ONE/api/v1";
	//we do not the localhost and port number here
	//instead we use service_id in application from the eureka dashboard

	@Autowired
	public ClientController(RestTemplate template) {
		super();
		this.template = template;
	}
	
	@GetMapping(path="/client/books")
		public String getBooks() {
		return this.template.getForObject(baseURL+"/books", String.class); 
	}
}
