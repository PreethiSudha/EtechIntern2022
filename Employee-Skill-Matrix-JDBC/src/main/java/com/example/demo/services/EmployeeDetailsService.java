package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.ResponseBean;
import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.jdbc.EmployeeDesignationJdbc;
import com.example.demo.jdbc.EmployeeDetailsJdbc;

@Service
public class EmployeeDetailsService {

	@Autowired
	private EmployeeDetailsJdbc empDetJdbc;
	
	@Autowired
	private EmployeeDesignationJdbc empDesgJdbc;
	
	//API-2(INSERT)
	public Object add(EmployeeDetails entity) {
		Object resp = null;
		try {
			Optional<EmployeeDesignation> empDesgId = empDesgJdbc.findByDesgId(entity.getEmpDesignationId());
			if(empDesgId.isPresent()){
				resp = empDetJdbc.add(entity);
				return resp = "Entity Added";
			}}
		catch(Exception ex) {
			System.out.println("Exception as : " +ex);
			return resp;
		}
		return resp = "Invalid Designation Id";
	}

	public List<EmployeeDetails> findAll() {
		return empDetJdbc.findAll();
	}
	
	//API-2(UPDATE)
	public Object update(EmployeeDetails entity) {
		Object resp = null;
		try {
			ResponseBean beanDetails = empDetJdbc.getEmpDetails(entity.getEmpDesignationId());
			String empDes = beanDetails.getEmpDesignation();
			if(empDes.equalsIgnoreCase("Project Manager")) {
				resp = empDetJdbc.update(entity);
				return resp = "Entity Updated";
			}}
		catch(Exception ex) {
			System.out.println("Exception as : " +ex);
			return resp;
		}
		return resp = "Entered Employee Designation Id is not of Manager";
	}

//		Object resp = null;
//		try {
//		resp = empDetJdbc.update(entity);
//		String result = resp.toString();
//		if(result != null) {
//			return result = "Updated";
//		}else {
//			return	result = "Already Updated";
//		}}catch(Exception ex) {
//			System.out.println("Exception as : " +ex);
//		}
//		return resp;
//	}
	
	public List<ResponseBean> getEmployee(String empName , String empDesignation ){
		return empDetJdbc.getEmployee(empName,empDesignation);
	}
	
}
