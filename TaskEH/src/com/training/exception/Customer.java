package com.training.exception;

public class Customer {

	private int customerId;
	private String customerName;
	private int custPhonenumber;
	private String customerEmailId;
	
	public Customer() {
		super();
		
	}

	public Customer(int customerId, String customerName, int custPhonenumber, String customerEmailId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.custPhonenumber = custPhonenumber;
		this.customerEmailId = customerEmailId;
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustPhonenumber() {
		return custPhonenumber;
	}

	public void setCustPhonenumber(int custPhonenumber) {
		this.custPhonenumber = custPhonenumber;
	}

	
	public String getCustomerEmailId() 
	{
		return customerEmailId;
	}

	public void setCustomerEmailId(String email) throws InvalidEmailException 
	{
		if(email.contains("@") && email.contains(".com") && email.contains(".org") && email.contains(".in")) {
		this.customerEmailId = email;
		System.out.println("Valid mail");}
		else {
			throw new InvalidEmailException("Invalid mail");
		}
	}

	
}
