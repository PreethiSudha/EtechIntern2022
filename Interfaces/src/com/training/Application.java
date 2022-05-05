package com.training;
import com.training.ifaces.*;
import com.training.services.CurrencyConverter;

public class Application {

	public static void main(String[] args) {
		
		//subType = new subType
		//CurrencyConverter = new CurrencyConverter();
		
		//superType = subType
		Function conv = new CurrencyConverter();
		
		double response = conv.apply(200);
		
		System.out.println(Function.COUNTER);
		System.out.println(response);
		
		//Line 15 and 17 and 20 are identical
		System.out.println(conv.apply(300));
		
		
		//Casting
		if(conv instanceof CheckCondition) {
			
			CheckCondition obj = (CheckCondition)conv;
			
			System.out.println("Is Discount Allowed: =" +obj.test(6000));
		}
		
		//if we don't implements the class CurrencyConverter from interface ChackCondition 
		//then use the else part
		else {
			
			System.out.println("Cannot be cast");
		}
		
		//superType = subType
		Conditional CondObj = new DiscountCalculator();
		
		System.out.println(CondObj.test(5000));
		System.out.println(CondObj.negate(6000));
	
		
	}

}
