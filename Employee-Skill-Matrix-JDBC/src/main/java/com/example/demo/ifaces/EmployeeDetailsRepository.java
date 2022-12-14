package com.example.demo.ifaces;

import java.util.List;

import com.example.demo.entity.EmployeeDetails;

public interface EmployeeDetailsRepository {
	
	public Object create(EmployeeDetails entity);
	public Object add(EmployeeDetails entity);
	public Object update(EmployeeDetails entity);
	public List<EmployeeDetails> findAll();
	public EmployeeDetails findByEmpName(Object empName);
	
}
