package com.employee.service;

import com.employee.task.Employee;

public class EmployeeService {
	
	 public double calculateBonus(Employee sushmi) {
		 double bonus= sushmi.getEmpSalary();
		 return 0.33*bonus;
	 }

}
