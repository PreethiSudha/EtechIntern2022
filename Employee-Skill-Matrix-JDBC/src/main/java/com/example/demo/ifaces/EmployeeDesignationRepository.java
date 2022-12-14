package com.example.demo.ifaces;

import java.util.List;

import com.example.demo.entity.EmployeeDesignation;

public interface EmployeeDesignationRepository {
	
	public Object create(EmployeeDesignation entity);
	public int add(EmployeeDesignation entity);
	public List<EmployeeDesignation> findAll();

}
