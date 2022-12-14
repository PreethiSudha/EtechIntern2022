package com.example.demo.controllers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee_Designation;
import com.example.demo.entity.Transaction_Log;
import com.example.demo.repo.TransactionLogRepo;
import com.example.demo.services.EmployeeDesignationService;

@RestController
@RequestMapping(path = "api/v1/empDesignation")
public class EmployeeDesignationController {

	@Autowired
	private Transaction_Log transLog;
	
	@Autowired
	private TransactionLogRepo transLogRepo;
	
	@Autowired
	private EmployeeDesignationService empDesService;
	
	public void transactionstatus(Object obj1,Object obj2) {
		
		transLog.setApiOperationName("EmployeeDesigination");
		transLog.setCreatedTime(LocalTime.now());
		transLog.setCreatedDate(LocalDate.now());
		transLog.setRequest(obj1.toString());
		transLog.setResponse(obj2.toString());
		
		this.transLogRepo.save(transLog);
		
	}
	
	// POST api to create EmpDesignation to the table
	@PostMapping(path="/empDes")
	public Employee_Designation addUser(@RequestBody Employee_Designation entity) {
		return this.empDesService.addUser(entity);
	}
	
	@GetMapping(path="/getEmpDes")
	public List<Employee_Designation> getAll(){
		return this.empDesService.getAll();
	}
	
//	@PutMapping(path="/update/empDes")
//	public ResponseEntity<Employee_Designation> updateEmpDes(@RequestBody Employee_Designation entity){
//		return ResponseEntity.status(201).body(entity);
//	}
	
}
