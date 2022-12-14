package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeAssociateManager;
import com.example.demo.services.EmpAssManService;

@RestController
@RequestMapping(path="api/v1/EmpAssMan/")
public class EmpAssManController {

	@Autowired
	private EmpAssManService eamService;
	
	@PostMapping(path="create")
	public Object create(EmployeeAssociateManager entity) {
		return eamService.create(entity);
	}
	
	@PostMapping(path="add")
	public int add(EmployeeAssociateManager entity) {
		return eamService.add(entity);
	}
	
	@GetMapping(path="findAll")
	public List<EmployeeAssociateManager> findAll() {
		return eamService.findAll();
	}
	
}
