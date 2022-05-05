package com.training.model;
import com.training.model.BankAccount;
import com.training.model.SavingsAccount;


public class Application {

	public static void main(String[] args) {
		
		BankAccount ramsaccount = new BankAccount(1010, "Ramesh", 50000, "Savings");
		System.out.println(ramsaccount);
		
		SavingsAccount account = new SavingsAccount(650, "ramesh", 178,"joint", "rajesh");
		
		System.out.println(account.getAccountHolderName());
		
		System.out.println(account.getNominee());

	}

}
