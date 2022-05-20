package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findByDateOfBirth(LocalDate dob);
	public List<Employee> findByLocation(String loc);
	public List<Employee> findBySkillSet(String skill);
	public List<Employee> findByLocationAndSkillSet(String loc, String skill);

	@Query(nativeQuery = true, 
			value = "select * from Preetz_Employee where location:= loc and skillSet:= skill")
	public List<Employee> getByName(@Param("loc") String loc,
									@Param("skill") String skill);
	
}
