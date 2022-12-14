package com.example.demo.repo;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee_Details;


public interface EmployeeDetailsRepo extends JpaRepository<Employee_Details, Integer> {

	@Query(value = "select * from pre_emp_details where emp_designation_id=:id",nativeQuery = true)
	List<Employee_Details> findByEmpDesignationId(@Param("id") int id);
	
	@Query(value = "select * from pre_emp_details where emp_name=:name",nativeQuery = true)
	Employee_Details findByEmployeeName(@Param("name")String name);
	
	@Query(value="select * from pre_emp_details where emp_id=:id", nativeQuery = true)
	public Employee_Details findByEmpId(@Param("id")int id);

	@Query(value ="update pre_emp_details set manager_name=:managerName where emp_id=:empId",nativeQuery = true)
	@Modifying
	@Transactional
	public int updateEmployeeDetails(@Param("managerName")String managerName,@Param("empId") int empId);

	
}
