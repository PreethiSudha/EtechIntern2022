package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.jdbc.EmployeeDesignationJdbc;

@Service
public class EmployeeDesignationService {

	@Autowired
	private EmployeeDesignationJdbc empDesgJdbc;
	
	public int add(EmployeeDesignation entity) {
		return empDesgJdbc.add(entity);
	}
	
	public List<EmployeeDesignation> findAll() {
		return empDesgJdbc.findAll();
	}
}
