package com.training.services;

import com.training.ifaces.AgeCondition;
import com.training.ifaces.Conditional;

public class StudentResultService implements Conditional<Double>, AgeCondition<Double> {

	@Override
	public boolean test(Double t) {
		return t>80.00;
	}

	@Override
	public boolean negate(Double age) {
		//completely overriding supertype with custom code
		if(age>100) {
			return true;
		}else {
			return false;
		}
		
		//calling one of the super type
//		boolean result1 = Conditional.super.negate(age);
//		////return result1;
//		
//		boolean result2 = AgeCondition.super.negate(age);
//		////return result2;
//		
		//calling both the super type
//		if(result1 && result2) {
//			return true;
//		}else {
//			return false;
//		}
	}
	
	
	

}
