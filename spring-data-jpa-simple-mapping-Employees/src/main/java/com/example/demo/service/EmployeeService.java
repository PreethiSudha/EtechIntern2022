package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository repo;

	@Autowired
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Employee add(Employee entity) {
		return this.repo.save(entity);
	}
	
	public List<Employee> findAll(){
		return this.repo.findAll();
	}
	
	public List<Employee> findByDateOfBirth(LocalDate dob){
		return this.repo.findByDateOfBirth(dob);
	}
	
	public List<Employee> findByLocation(String loc){
		return this.repo.findByLocation(loc);
	}
	
	public List<Employee> findBySkillSet(String skill){
		return this.repo.findBySkillSet(skill);
	}
	
	public List<Employee> getByName(@Param("loc") String loc,
			@Param("skill") String skill){
		return this.repo.findByLocationAndSkillSet(loc, skill);
	}
}
