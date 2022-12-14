package com.example.demo.controllers;

import java.util.List;
import java.util.Map;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee_Details;
import com.example.demo.services.EmployeeDetailsService;

@RestController
@RequestMapping(path="api/v1/empDetails")
public class EmployeeDetailsController {
	
	@Autowired
	private EmployeeDetailsService empDetService;
	
	/*API - 2*/
	// POST api To insert Employee Details
	@PostMapping(path="/add/employee")
	@RolesAllowed({"ADMIN"})
	public Employee_Details addEmployee(@RequestBody Map<String, String> entity){
		Employee_Details response = this.empDetService.add(entity);
		empDetService.transactionstatus(entity, response);
		return response;
	}
	
	/*API - 2*/
	// GET api To fetch All Employee Details
	@GetMapping(path="/getAll/employees")
	public List<Employee_Details> getEmployee(){
		List<Employee_Details> list = empDetService.findAllEmpDetails();
		int response = list.size();
		empDetService.transactionstatus("request for get all employees", response);
										//+"Employee Details Retrieved from DB");
		return this.empDetService.findAllEmpDetails();
	}
	
	/*API - 2*/
	// PUT api To update Employee Details
	@PutMapping(path = "/update/empDetails")
	@RolesAllowed({"ADMIN"})
	public ResponseEntity<Employee_Details> updateEmployee(@RequestBody Employee_Details entity){
		Employee_Details rowsUpdated = empDetService.updateEmployee(entity);
		empDetService.transactionstatus(entity, rowsUpdated);
		//return rowsUpdated;
		return ResponseEntity.status(HttpStatus.OK).body(rowsUpdated);
	}
	
	
	@PutMapping(path="/update/employees/associate")
	public Object associateManager(@RequestBody Map<String, String> request) {
		Object response = empDetService.associateEmployees(request);
		empDetService.transactionstatus(request, response);
		return empDetService.associateEmployees(request);
	}
}















