package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee_Designation;

public interface EmployeeDesignationRepo extends JpaRepository<Employee_Designation, Integer> {

	@Query(value = "select * from pre_emp_designation where emp_designation_id=:id",nativeQuery = true)
	public Employee_Designation findByDesgId(@Param("id") int designationId);
	
	
	
}
