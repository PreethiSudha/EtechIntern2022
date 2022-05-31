package com.training.model;

public class SavingsAccount extends BankAccount
{
private String nominee;


public SavingsAccount() {
	super();
	// TODO Auto-generated constructor stub
}

public SavingsAccount(int accountnumber, String accountHoldername, double balance, String accountType) {
	super(accountnumber, accountHoldername, balance, accountType);
	// TODO Auto-generated constructor stub
}

public SavingsAccount(int accountnumber, String accountHoldername, double balance) {
	super(accountnumber, accountHoldername, balance);
	// TODO Auto-generated constructor stub
}

public SavingsAccount(int accountnumber, String accountHoldername, double balance, String accountType, String nominee) {
	super(accountnumber, accountHoldername, balance, accountType);
	this.nominee = nominee;
}

public String getNominee() {
	return nominee;
}

public void setNominee(String nominee) {
	this.nominee = nominee;
}



// whenever sub class constructor is called  its super class constructor
//also called even if super() key word is not present

//public SavingsAccount()
//{
//	super();
//	System.out.println("constructor of subclass called");
//	
//}

//public SavingsAccount()
//{
//	super(1020,"ram",5000);
//	System.out.println("constructor of sub class called");
//}

}
