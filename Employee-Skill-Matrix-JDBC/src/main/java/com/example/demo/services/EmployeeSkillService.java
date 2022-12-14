package com.example.demo.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.entity.EmployeeSkills;
import com.example.demo.jdbc.EmployeeDesignationJdbc;
import com.example.demo.jdbc.EmployeeDetailsJdbc;
import com.example.demo.jdbc.EmployeeSkillsJdbc;

@Service
public class EmployeeSkillService {
	
	@Autowired
	private EmployeeSkillsJdbc empSkillJdbc;
	
	@Autowired
	private EmployeeDetailsJdbc empDetJdbc;
	
	@Autowired
	private EmployeeDesignationJdbc empDesigJdbc;
	
	public Object create(EmployeeSkills entity) {
		return empSkillJdbc.create(entity);
	}
	
	public List<EmployeeSkills> findAll() {
		return empSkillJdbc.findAll();
	}
	
	//API-4
	public Object add(EmployeeSkills entity) {
		Object resp = null;
		entity.setStatus("DRAFT");
		entity.setCreatedDate(Date.valueOf(LocalDate.now()));
		try {
		resp = empSkillJdbc.add(entity);
		return  resp = "New Employee Skill added with default status as DRAFT";
		}
		catch(Exception ex) {
		System.out.println("Exception thrown as : " +ex);
		}
		return resp;
	}
	
	public Object updateBySkillName(EmployeeSkills entity) {
		Object resp = null;
		entity.setModifiedDate(Date.valueOf(LocalDate.now()));
		try{
			resp = empSkillJdbc.updateBySkillName(entity);
			return resp = "status updated";
		}catch(Exception ex) {
		System.out.println("Exception thrown as : " +ex);
		}
		return resp;
	}
	
	//API-7
	public List<EmployeeSkills> searchBySkillNameAndExperience(String skillName, String experience) {
		return empSkillJdbc.searchBySkillNameAndExperience(skillName, experience);
	}
	
	// API-8
	public List<EmployeeSkills> searchbyEmpNameOrApprovedByOrStatus(String empName, String ApprovedBy,String status) {
		EmployeeDetails empdetails = empDetJdbc.searchByEmpName(empName);
		//List<Employee_Skills> response = empSkillJdbc.findByEmpId(empdetails.getEmpId());
		return empSkillJdbc.searchbyEmpNameOrApprovedByOrStatus(empdetails.getEmpId(), ApprovedBy, status);
	}

	// API-5
	public Object getEmployeeSkills(String empName) {
		Object resp = null;
		try {
		EmployeeDetails emp = empDetJdbc.searchByEmpName(empName);
		List<EmployeeSkills> response = null;
		int designationId = emp.getEmpDesignationId();
		EmployeeDesignation empDesignation = empDesigJdbc.findByDesId(designationId);
		if (empDesignation.getEmpDesignation().equalsIgnoreCase("Project Manager")) {
			response = this.empSkillJdbc.searchByStatusAndManagerId(empName, "DRAFT");
			return response;
		} else {
			return empName + "is not a Manager";
		}}catch(Exception ex) {
			System.out.println("Exception occurs as : " +ex);
		}
		return resp;
	}

	// API-6
	public Object updateEmpSkill(String empName, String status) {
		String respStatus = null;
		EmployeeSkills entity = new EmployeeSkills();
		entity.setApprovedBy(empName);
		entity.setApprovedDate(Date.valueOf(LocalDate.now()));
		EmployeeDetails emp = empDetJdbc.searchByEmpName(empName);
		int designationId = emp.getEmpDesignationId();
		EmployeeDesignation empDesignation = empDesigJdbc.findByDesId(designationId);
		if (empDesignation.getEmpDesignation().equalsIgnoreCase("Project Manager")) {
			int count = empSkillJdbc.updateEmpSkillsByManagerId(status, emp.getEmpName(), emp.getEmpId(), Date.valueOf(LocalDate.now()));
			if (count > 0) {
				respStatus = "Updated";
			} else {
				respStatus = "Already updated";
			}
		}
		return respStatus;
	}
	
	
}
