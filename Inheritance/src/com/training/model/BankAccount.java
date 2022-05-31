package com.training.model;

public class BankAccount {
	private int accountnumber;
	private String accountHoldername;
	private double balance;
	private String accountType;
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public BankAccount(int accountnumber, String accountHoldername, double balance, String accountType) {
		super();
		System.out.println("four arguements constructors");
		this.accountnumber = accountnumber;
		this.accountHoldername = accountHoldername;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	public BankAccount() {
		super();
		System.out.println("zero arguements constructor");
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accountnumber, String accountHoldername, double balance) {
		super();
		System.out.println("three arguements constructors");
		this.accountnumber = accountnumber;
		this.accountHoldername = accountHoldername;
		this.balance = balance;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.accountnumber+","+this.accountHoldername+","+this.balance+","+this.accountType;
	}
}
