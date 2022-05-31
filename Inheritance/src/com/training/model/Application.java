package com.training.model;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount account=new SavingsAccount(650,"ramesh",787,"joint","rajesh");
		System.out.println(account.getAccountHoldername());
		System.out.println(account.getNominee());
		
		SavingsAccountService service=new SavingsAccountService();
		System.out.println(service.getCustomerInfo(account)); 
		System.out.println(service.calculateInterest(account)); 
		
		BankAccountService service2=new SavingsAccountService();
		
		//cannot access sub class method with super class reference 
		//service2.getCustomerInfo(account)
		
		SavingsAccountService savingService=(SavingsAccountService)service2;
		System.out.println((savingService).getCustomerInfo(account));
		
	}

}
