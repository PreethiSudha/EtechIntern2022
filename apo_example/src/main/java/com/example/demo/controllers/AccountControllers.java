package com.example.demo.controllers;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.services.AccountService;

@RestController
@RequestMapping(path="/api/v1")
public class AccountControllers {

	private AccountService service;

//	Logger logger = Logger.getAnonymousLogger();

	@Autowired
	public AccountControllers(AccountService service) {
		super();
//		logger.info("Account Controller Constructor called");
		this.service = service;
	}
	
	@GetMapping(path="/accounts")
	public List<String> getAccounts(){
//		logger.info("GET Accounts Method Called : ");
		return this.service.getAccounts();
		
	}	
	
} 
