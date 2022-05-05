package com.training;

public class MobileBill {
	
	private String customerName; 
	private long mobileNumber; 
	private String planName;
	
	public static final String BRAND = "AIRTEL";
		MobileBill() {
		super();
		
	}

	public MobileBill(String customerName, long mobileNumber, String planName) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.planName = planName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	public double findAmount() {
		
		double amount = 250.0;
		 switch (planName){ 
		 
		 case "Prepaid":
			 amount = 200.0;
		break;
		 
		 case "Postpaid":
			 amount = 300.0;
		break;
		
		 default:
		break;
		
		 }
		return amount;	 
		
		
	}
}	
