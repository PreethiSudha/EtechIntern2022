package com.customer.task;

public class Customer {
	
	private String cusName;
	private long cusNo;
	private String cusGender;
	private String cusPlace;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(String cusName, long cusNo, String cusGender, String cusPlace) {
		super();
		this.cusName = cusName;
		this.cusNo = cusNo;
		this.cusGender = cusGender;
		this.cusPlace = cusPlace;
	}


	public String getCusName() {
		return cusName;
	}


	public void setCusName(String cusName) {
		this.cusName = cusName;
	}


	public long getCusNo() {
		return cusNo;
	}


	public void setCusNo(long cusNo) {
		this.cusNo = cusNo;
	}


	public String getCusGender() {
		return cusGender;
	}


	public void setCusGender(String cusGender) {
		this.cusGender = cusGender;
	}


	public String getCusPlace() {
		return cusPlace;
	}


	public void setCusPlace(String cusPlace) {
		this.cusPlace = cusPlace;
	}
	
	

}
