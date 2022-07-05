package com.employee.task;

public class Employee {

	private String empName;
	private int empId;
	private double empSalary;
	private String empPosition;
	
	public Employee() {
		super();
	}
	
	
	public Employee(String empName, int empId, double empSalary, String empPosition) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empPosition = empPosition;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public double getEmpSalary() {
		return empSalary;
	}
	
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public String getEmpPosition() {
		return empPosition;
	}
	
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
 
	
	
	
	
}
