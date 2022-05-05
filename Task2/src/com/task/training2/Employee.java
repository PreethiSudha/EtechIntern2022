package com.task.training2;

public class Employee {
	private int empId;
	private String empName;
	private int empMblNumber;
	private String orderName;
	private double orderPrice;
	
	
	public Employee(int empId, String empName, int empMblNumber, String orderName, double orderPrice) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMblNumber = empMblNumber;
		this.orderName = orderName;
		this.orderPrice = orderPrice;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpMblNumber() {
		return empMblNumber;
	}


	public void setEmpMblNumber(int empMblNumber) {
		this.empMblNumber = empMblNumber;
	}


	public String getOrderName() {
		return orderName;
	}


	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}


	public double getOrderPrice() {
		return orderPrice;
	}


	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	

}
