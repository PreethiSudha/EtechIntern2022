package com.training.model;

public class SavingsAccountService extends BankAccountService{

	public String getCustomerInfo(SavingsAccount account)
	{
		return account.getAccountHoldername();
		
	}
	
}
