package com.example.demo.ifaces;

import java.util.List;

import com.example.demo.entity.EmployeeAssociateManager;

public interface EmpAssManRepository {
	
	public Object create(EmployeeAssociateManager entity);
	public int add(EmployeeAssociateManager entity);
	public List<EmployeeAssociateManager> findAll();
	

}
