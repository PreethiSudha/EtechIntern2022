package com.example.demo.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Skills_Reference;
import com.example.demo.entity.Transaction_Log;
import com.example.demo.repo.EmployeeDetailsRepo;
import com.example.demo.repo.SkillsReferenceRepo;
import com.example.demo.repo.TransactionLogRepo;

@Service
public class SkillsReferenceService {
	
	@Autowired
	private SkillsReferenceRepo skillRefRepo;
	
	@Autowired
	private Transaction_Log transaction;
	
	@Autowired
	private TransactionLogRepo transLogRepo;
	
	@Autowired
	private EmployeeDetailsRepo empDetRepo;

	public void transactionstatus(Object obj1, Object obj2) {
		
		transaction.setApiOperationName("SkillReferenceController");
		transaction.setCreatedTime(LocalTime.now());
		transaction.setCreatedDate(LocalDate.now());
		transaction.setRequest(obj1.toString());
		transaction.setResponse(obj2.toString());
		
		this.transLogRepo.save(transaction);
	}
	
//	public Skills_Reference insert(Skills_Reference entity) {
//	return this.skillRefRepo.save(entity);
//}

	public Object insert(Skills_Reference entity) {
		String createdBy = entity.getCreatedBy();
		Skills_Reference response = null;
		List<String> managerName = empDetRepo.findByEmpDesignationId(101).stream()
								.map(e->e.getEmpName()).collect(Collectors.toList());
		try {
		if(managerName.contains(createdBy)) {
			System.out.println(entity);
			response = this.skillRefRepo.save(entity);
			return response;
		}else {
			return "createdBy is not of Manager";
		}
		}
		catch(Exception e){
			return "Skill Name Already Exists";
		}
	}
	
	public List<Skills_Reference> skillList(){
		return this.skillRefRepo.findAll();
	}
}
	
