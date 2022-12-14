package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.ResponseBean;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.services.EmployeeDetailsService;

@RestController
@RequestMapping(path="api/v1/empDetails/")
public class EmployeeDetailsController {

	@Autowired
	private EmployeeDetailsService empDetService;
	
	@PostMapping(path="add")
	public Object add(@RequestBody EmployeeDetails entity) {
		return empDetService.add(entity);
	}
	
	@GetMapping(path="findAll")
	public List<EmployeeDetails> findAll() {
		return empDetService.findAll();
	}
	
	@PutMapping(path="update")
	public Object update(@RequestBody EmployeeDetails entity) {
		return empDetService.update(entity);
	}
	
	//API-2
	@GetMapping(path="getEmployee")
	public List<ResponseBean> getEmployee(String empName , String empDesignation ){
		return empDetService.getEmployee(empName,empDesignation);
	}
	
	
}
