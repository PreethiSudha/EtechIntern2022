package com.training.model;

public class SavingsAccount extends BankAccount {
	
	private String nominee;
	
	//whenever sub class constructor is called, its super class constructor also called, 
	//Even if super() key word is not present. 
	
	
	public SavingsAccount() {
		
		super();
		System.out.println("Constructor of SUB CLASS called");
	}
	
	
	public SavingsAccount() {
		
		super(1020, "ram", 5000);
		System.out.println("Constructor of SUB CLASS called");
		
	}
}