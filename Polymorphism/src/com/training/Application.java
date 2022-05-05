package com.training;

import com.training.utils.ObjectFactory;
import com.training.ifaces.Conditional;

public class Application {

	public static void main(String[] args) {
		
		ObjectFactory factory = new NewObjectFactory();
		
		Conditional profObj = factory.getConditional(1);
		
		Conditional studObj = factory.getConditional(2);
		
		Conditional princObj = factory.getConditional(3);
		
		//System.out.println(object.test("chennai"));
		
		System.out.println("Allowance: " +factory.getValue(profObj, "CHENNAI"));
		
		System.out.println("Allowance: " +factory.getValue(studObj, "50"));
		
		System.out.println("Allowance: " +factory.getValue(princObj, "mahendra college of engineering"));
		
		
	}

}
