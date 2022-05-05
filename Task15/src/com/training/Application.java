package com.training;

import com.training.ifaces.Automobile;
import com.training.utils.ObjectFactory;

public class Application {

	public static void main(String[] args) {
		
		ObjectFactory obj = new ObjectFactory();
		
		Automobile maru = obj.getObject(1);
		Automobile toyo = obj.getObject(2);
		
		obj.printQuote(maru);
		obj.printQuote(toyo);
	}

}
