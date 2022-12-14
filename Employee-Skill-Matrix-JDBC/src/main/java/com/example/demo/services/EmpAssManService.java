package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeAssociateManager;
import com.example.demo.jdbc.EmpAssManJdbc;

@Service
public class EmpAssManService {
	
	@Autowired
	private EmpAssManJdbc eamJdbc;
	
	public Object create(EmployeeAssociateManager entity) {
		return eamJdbc.create(entity);
	}
	
	public int add(EmployeeAssociateManager entity) {
		return eamJdbc.add(entity);
	}
	
	public List<EmployeeAssociateManager> findAll() {
		return eamJdbc.findAll();
	}

}
