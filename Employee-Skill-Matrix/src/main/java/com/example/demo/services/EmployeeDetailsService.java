package com.example.demo.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee_Details;
import com.example.demo.entity.Transaction_Log;
import com.example.demo.repo.EmployeeDetailsRepo;
import com.example.demo.repo.TransactionLogRepo;

@Service
public class EmployeeDetailsService {

	
	@Autowired
	private EmployeeDetailsRepo empDetRepo;
	
	@Autowired
	private Transaction_Log transaction;
	
	@Autowired
	private TransactionLogRepo transLogRepo;
	
	public void transactionstatus(Object obj1, Object obj2) {
			
			transaction.setApiOperationName("Employee_Details");
			transaction.setCreatedDate(LocalDate.now());
			transaction.setCreatedTime(LocalTime.now());
			transaction.setRequest(obj1.toString());
			transaction.setResponse(obj2.toString());
			transLogRepo.save(transaction);
		}
	
	public Employee_Details add(Map<String, String> entity){
		Employee_Details empDetails = new Employee_Details();
		if(Integer.parseInt(entity.get("empDesignationId"))==101) {
			empDetails.setEmpDesignationId(Integer.parseInt(entity.get("empDesignationId")));
			empDetails.setEmpId(Integer.parseInt(entity.get("empId")));
			empDetails.setEmpName(entity.get("empName"));
			empDetails.setEmpDoj(LocalDate.parse(entity.get("empDoj")));
			empDetails.setManager("Project Manager");
		}else {
			empDetails.setEmpDesignationId(Integer.parseInt(entity.get("empDesignationId")));
			empDetails.setEmpId(Integer.parseInt(entity.get("empId")));
			empDetails.setEmpName(entity.get("empName"));
			empDetails.setEmpDoj(LocalDate.parse(entity.get("empDoj")));
			empDetails.setManager("NA");
		}
		return this.empDetRepo.save(empDetails);
	}

	public List<Employee_Details> findAllEmpDetails() {
		return this.empDetRepo.findAll();
	}
	
	public Employee_Details updateEmployee(Employee_Details entity){
		return this.updateEmployee(entity);
	}

	public Object associateEmployees(Map<String, String> entity) {
		int count = 0;
		String manager = entity.get("ManagerName");
		List<String> emp = empDetRepo.findByEmpDesignationId(101)
									.stream()
									.map(e->e.getEmpName())
									.collect(Collectors.toList());
		
		if(emp.contains(manager)) {
			List<String> keys = Arrays.asList(entity.get("empId").split(","));
			for(String empId: keys) {
				int val = empDetRepo.updateEmployeeDetails(manager,Integer.parseInt(empId));
				count = val++;
			}
		}else {
			return count;
		}
		return "The returned value is not a Manager";
	}

}