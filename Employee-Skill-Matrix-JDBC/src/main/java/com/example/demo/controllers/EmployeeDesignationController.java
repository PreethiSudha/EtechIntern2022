package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.services.EmployeeDesignationService;

@RestController
@RequestMapping(path="api/v1/empDesgination")
public class EmployeeDesignationController {
	
	@Autowired 
	private EmployeeDesignationService empDesgService;
	
	@PostMapping(path="create/empDes")
	public int add(EmployeeDesignation entity) {
		return empDesgService.add(entity);
	}
	
	@GetMapping(path="findAll")
	public List<EmployeeDesignation> findAll() {
		return empDesgService.findAll();
	}

}
