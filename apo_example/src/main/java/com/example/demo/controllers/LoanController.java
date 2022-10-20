package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.LoanService;

@RestController
@RequestMapping(path="/api/v1")
public class LoanController {

	private LoanService service;
	
	@Autowired
	public LoanController(LoanService service) {
		super();
		this.service = service;
	}

	@GetMapping(path="/loans")
	public ResponseEntity<String> getLoanDetails(){
		double val11 = this.service.getInterestRate(6500);
		//double val22 = this.service.getInterestRate(6500,16500);
		return ResponseEntity.ok(+val11 +" Per Annum ");
		//return ResponseEntity.ok("Value1 : " +val11 + " Per Annum" +" , " +"Value2 : "  +val22 + " Per Annum");	
	}	
	
}
