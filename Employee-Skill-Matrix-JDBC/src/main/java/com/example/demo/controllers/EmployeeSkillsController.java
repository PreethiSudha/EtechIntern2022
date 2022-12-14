package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeSkills;
import com.example.demo.services.EmployeeSkillService;

@RestController
@RequestMapping(path="api/v1/EmpSkills/")
public class EmployeeSkillsController {
	
	@Autowired
	private EmployeeSkillService empSkillService;
	
	@PostMapping(path="create")
	public Object create(@RequestBody EmployeeSkills entity) {
		return empSkillService.create(entity);
	}
	
	@GetMapping(path="findAll/empSkill")
	public List<EmployeeSkills> findAll() {
		return empSkillService.findAll();
	}
	
	//API-4 (INSERT)
	@PostMapping(path="add/empSkill")
	public Object add(@RequestBody EmployeeSkills entity) {
		return empSkillService.add(entity);
	}
	
	//API-4 (UPDATE)
	@PutMapping(path="update/skillName/empSkill")
	public Object updateBySkillName(@RequestBody EmployeeSkills entity) {
		return empSkillService.updateBySkillName(entity);
	}
	
	//API-7
	@GetMapping(path="search/SkillNameAndExperience/{skillName}/{skillExperience}")
	public List<EmployeeSkills> searchBySkillNameAndExperience(@PathVariable("skillName") String skillName, @PathVariable("skillExperience")String experience) {
		return empSkillService.searchBySkillNameAndExperience(skillName, experience);
	}
	
	//API-8
	@GetMapping(path="search/searchbyEmpNameorApprovedByorStatus/{empName}/{ApprovedBy}/{status}")
	public List<EmployeeSkills> searchbyEmpNameOrApprovedByOrStatus(@PathVariable("empName") String empName, @PathVariable("ApprovedBy")String ApprovedBy,
			@PathVariable("status") String status) {
		return empSkillService.searchbyEmpNameOrApprovedByOrStatus(empName, ApprovedBy, status);
	}
	
	//API-5
	@GetMapping(path = "manager/{empName}")
	public Object getEmployeeSkills(@PathVariable("empName") String empName){
		return empSkillService.getEmployeeSkills(empName);
	}
	
	//API-6
	@GetMapping(path="managerAndstatus/{manager}/{status}")
	public Object updateEmpSkill(@PathVariable("manager") String empName, @PathVariable("status") String status) {
		return empSkillService.updateEmpSkill(empName,status);
	}
	
	
	
	
	
}










