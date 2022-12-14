package com.example.demo.ifaces;

import java.util.List;

import com.example.demo.entity.EmployeeSkills;

public interface EmployeeSkillsRepository {
	
	public Object create(EmployeeSkills entity);
	public Object add(EmployeeSkills entity);
	public List<EmployeeSkills> findAll();
	public List<EmployeeSkills> searchBySkillNameAndExperience(String skillName, String experience);
	List<EmployeeSkills> searchbyEmpNameOrApprovedByOrStatus(int empId, String approvedBy, String status);
}
