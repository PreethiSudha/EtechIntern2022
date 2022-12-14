package com.example.demo.services;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.entity.SkillsReference;
import com.example.demo.jdbc.EmployeeDesignationJdbc;
import com.example.demo.jdbc.EmployeeDetailsJdbc;
import com.example.demo.jdbc.SkillsReferenceJdbc;

@Service
public class SkillsReferenceService {
	
	@Autowired
	private SkillsReferenceJdbc skillRefJdbc;
	
	@Autowired
	private EmployeeDetailsJdbc empDetJdbc;
	
	@Autowired
	private EmployeeDesignationJdbc empDesigJdbc;
	
	public Object create(SkillsReference entity) {
		return skillRefJdbc.create(entity);
	}

	public int add(SkillsReference entity) {
		return skillRefJdbc.add(entity);
	}
	
	public List<SkillsReference> findAll() {
		return skillRefJdbc.findAll();
	}
	
	//API-3
	public Object addSkillDetails(SkillsReference entity) {
		Object response = null;
		entity.setCreatedDate(Date.valueOf(LocalDate.now()));
		entity.setCreatedTime(Time.valueOf(LocalTime.now()));
		System.out.println("Date : "+entity.getCreatedDate());
		System.out.println("Time : " +entity.getCreatedTime());
		//Object empName = skillRefJdbc.getEmpName();
		try {
		EmployeeDetails empDetails = empDetJdbc.findByEmpName(entity.getCreatedBy());
		//System.out.println(empName);
		//for(Employee_Details eachempDet : empDetails) {
			int empDesId = empDetails.getEmpDesignationId();
			System.out.println("EmpDesignationId  : " +empDesId);
			EmployeeDesignation result = empDesigJdbc.findByDesId(empDesId);
			if(Optional.of(result).isPresent()) {
				if(result.getEmpDesignation().equalsIgnoreCase("Project Manager")) {
				response = skillRefJdbc.add(entity);
				return response = "New Skill Details added";
			}else {
				response = " Entered Employee Name is not of Manager ";
			}
			}}catch(Exception ex) {
				System.out.println("Exception have thrown as : " +ex);
			}
		return response;
	}	
}
