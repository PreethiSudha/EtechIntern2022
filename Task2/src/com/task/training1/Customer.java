package com.task.training1;

public class Customer {
	private int custId;
	private String custName;
	private String custAddress;
	private int custMblNumber;
	
	public Customer(int custId, String custName, String custAddress, int custMblNumber) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custMblNumber = custMblNumber;
	}
	
	
	public int getCustId() {
		return custId;
	}




	public void setCustId(int custId) {
		this.custId = custId;
	}




	public String getCustName() {
		return custName;
	}




	public void setCustName(String custName) {
		this.custName = custName;
	}




	public String getCustAddress() {
		return custAddress;
	}




	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}




	public int getCustMblNumber() {
		return custMblNumber;
	}




	public void setCustMblNumber(int custMblNumber) {
		this.custMblNumber = custMblNumber;
	
	}
	
}
		





	