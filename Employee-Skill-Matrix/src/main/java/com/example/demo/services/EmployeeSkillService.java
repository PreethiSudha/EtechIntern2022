package com.example.demo.services;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee_Designation;
import com.example.demo.entity.Employee_Details;
import com.example.demo.entity.Employee_Skills;
import com.example.demo.entity.Transaction_Log;
import com.example.demo.repo.EmployeeDesignationRepo;
import com.example.demo.repo.EmployeeDetailsRepo;
import com.example.demo.repo.EmployeeSkillsRepo;
import com.example.demo.repo.TransactionLogRepo;

@Service
public class EmployeeSkillService {

	@Autowired
	private EmployeeSkillsRepo skillRepo;
	
	@Autowired
	private EmployeeDetailsRepo empDetRepo;

	@Autowired
	public EmployeeDesignationRepo empDesgrepo;
	 
	@Autowired
	private Transaction_Log transLog;
	
	@Autowired
	private TransactionLogRepo transLogRepo;

	public Employee_Skills save(Employee_Skills entity) {
		return this.skillRepo.save(entity);
	}
	
	public List<Employee_Skills> findAll(){
		return this.skillRepo.findAll();
	}
	
	public List<Employee_Skills> findBySkillNameAndExperience(String name, String exp) {
		return this.skillRepo.findBySkillNameAndExperience(name,exp);
	}

	public List<Employee_Skills> findBySkillName(String name) {
		return this.skillRepo.searchByName(name);
	}

	public List<Employee_Skills> findBySkillExperience(String exp){
		return this.skillRepo.searchByExp(exp);
	}

	public List<Employee_Skills> findByEmployeeId(int  id) {
		return this.skillRepo.findByEmployeeId(id);
	}
	 
	public List<Employee_Skills> findByApprover(String name) {
		return this.skillRepo.srchByApprover(name);
	}

	public List<Employee_Skills> findByStatus(String status) {
		return this.skillRepo.findByStatus(status);
	}

	public List<Employee_Skills> searchByValue(int id, String status, String approvedBy) {
		System.out.println("id:" +id + "status:" +status + "approvedBy:" +approvedBy);
		return this.skillRepo.findByNameOrstatusOrApproved(id,status,approvedBy);
	}

	public void transactionstatus(Object obj1,Object obj2) {
		transLog.setApiOperationName("Employee_Skill_Service");
		transLog.setCreatedTime(LocalTime.now());
		transLog.setCreatedDate(LocalDate.now());
		transLog.setRequest(obj1.toString());
		System.out.println("Response: " +obj2);
		transLog.setResponse(obj2.toString());
		this.transLogRepo.save(transLog);
	}
	
	public Object getEmployeeSkills(String empName) {
		Object resp = null;
		try {
		Employee_Details emp = empDetRepo.findByEmployeeName(empName);
		List<Employee_Skills> response = null;
		int designationId = emp.getEmpDesignationId();
		Employee_Designation empDesignation = empDesgrepo.findByDesgId(designationId);
		if (empDesignation.getEmpDesignation().equalsIgnoreCase("Project Manager")) {
			response = this.skillRepo.searchByStatusAndManagerId(empName, "DRAFT");
			return response;
		} else {
			return empName + "is not a Manager";
		}}catch(Exception ex) {
			System.out.println("Exception occurs as : " +ex);
		}
		return resp;
		
	}
	
	@Transactional
	public Object updateStatus(String status, String approvedBy) {
		String respStatus = null;
		try {
		Employee_Skills entity = new Employee_Skills();
		Employee_Details empdet = new Employee_Details();
		entity.setApprovedDate(Date.valueOf(LocalDate.now()));
		empdet = empDetRepo.findByEmployeeName(approvedBy);
		entity.setApprovedBy(approvedBy);
		int designationId = empdet.getEmpId();
		Employee_Designation empDesignation = empDesgrepo.findByDesgId(designationId);
		if (empDesignation.getEmpDesignation().equalsIgnoreCase("Project Manager")) {
			int count = skillRepo.updateEmpSkillsByManagerId(status, empdet.getEmpId(),Date.valueOf(LocalDate.now()));
			if (count > 0) {
				respStatus = "success";
			} else {
				respStatus = "failure";
			}
		}}catch(Exception ex) {
			System.out.println("Exception thrown as : " +ex);
		}
		return respStatus;
	}

	public List<Transaction_Log> getTransactionalLog() {
		return this.transLogRepo.findAll();
	}

	

}










	
//	public Object getEmployeeSkills(String empName) {
//		
//		List<Employee_Details> emp =empDetRepo.findByEmployeeName(empName);
//		List<Employee_Skills> response = null;
//		for(Employee_Details eachempDet : emp) {
//			if(empName.equals(eachempDet.getEmpName())) {
//				response=this.skillRepo.searchByStatusAndManagerId(empName , "DRAFT");
//				return	response;
//		}}
//		return empName + " is not of Manager";
//	}

	
//	public Object addEmpSkill(Employee_Skills entity) {
//		
//		entity.setStatus("DRAFT");
//		entity.setCreatedDate(Date.valueOf(LocalDate.now()));
//		entity.setModifiedDate(Date.valueOf(LocalDate.now()));
//		
//		if(empDetRepo.existsById(entity.getEmpId())) {
//			
//			Optional<SkillsReferenceRepo> result=skillRefRepo.findBySkillName(entity.getSkillName());
//	
//			if(result.isPresent())
//			{
//				int id=skillRefRepo.findBySkillName(entity.getSkillName()).get().getSkillId(id);
//				entity.setSkillId(id);
//		        return this.skillRepo.empSkillAdd(entity);
//			}
//			else {
//				return "Invalid Skill Name";
//			}
//		}
//		else {
//			return "Empolyee Id Not valid";
//		}
//		
//	}

//	public Object getEmpSkills(String status, String empName) {
//		
//		List<Employee_Details> emp = empDetRepo.findByEmployeeName(empName);
//		List<Employee_Skills> response = null;
//		String updated = null;
//		try {
//		for(Employee_Details eachempDet:emp) {
//			if(empName.equals(eachempDet.getEmpName())) {
//				this.skillRepo.searchByStatusAndManagerId(eachempDet.getEmpName() , status);
//				updated = this.skillRepo.updateEntity("APPROVED", LocalDate.now(), empName);
//				System.out.println(updated);
//				List<Employee_Skills> skills = this.skillRepo.findByStatus("APPROVED");
//				return skills;	
//			}
//			return response;
//		}}
//		catch(Exception ex){
//			System.out.println("Exception  :" +ex);
//		}
//		return empName + " : Entered EmpName is not of Manager" ;
//	}
	
	
//	public Object  updateEmpSkill(Employee_Skills entity) {
//		entity.setModifiedDate(Date.valueOf(LocalDate.now()));
//    
//		Optional<SkillsReferenceRepo> result=skillRefRepo.findBySkillName(entity.getSkillName());	
//		
//		if(result.isPresent())
//		{
//			 
//			int id=skillRefRepo.findBySkillName(entity.getSkillName()).get().getSkillId();
//			entity.setSkillId(id);
//	        return this.skillRepo.empSkillUpdate(entity);
//		}
//		else {
//			return "Invalid Skill Name";
//		}
//	}
//
//	



	
	
	

