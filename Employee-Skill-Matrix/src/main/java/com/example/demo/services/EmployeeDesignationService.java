package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee_Designation;
import com.example.demo.repo.EmployeeDesignationRepo;

@Service
public class EmployeeDesignationService {

	@Autowired
	private EmployeeDesignationRepo empDesRepo;

	public Employee_Designation addUser(Employee_Designation entity) {	
		return this.empDesRepo.save(entity);
	}

	public List<Employee_Designation> getAll() {
		return this.empDesRepo.findAll();
	}
}
