package com.training;

import com.training.exception.Customer;
import com.training.exception.InvalidEmailException;

public class Application {

	public static void main(String[] args ) {
		
		Customer ram = new Customer(1010, "Ramesh", 968574213, "rameshkanna@.com.org.in");
		String msg = ram.getCustomerEmailId();
		try {
			ram.setCustomerEmailId(msg);
		} 
		catch (InvalidEmailException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

}
