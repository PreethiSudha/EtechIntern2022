package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(args[0]);
//		
//		System.out.println(args[1]);
//		
//		System.out.println(args[2]);
//		
//		int value = Integer.parseInt(args[0]);
//		//value ++;
//		System.out.println(++value);
		
		CurrencyConverter conv = new CurrencyConverter();
		
		double dblAmount = Double.parseDouble(args[0]);
		
		System.out.println(conv.inrToUsd(dblAmount));

		double inrValue = Double.parseDouble(args[1]);
		
		System.out.println(conv.inrToEuro(inrValue));
		
		double inrValue2 = Double.parseDouble(args[2]);
		
		System.out.println(conv.inrToInr(inrValue2));
	
		double salary = 42500.00;
		
		int intSal = (int)salary;
		
		System.out.println(intSal);
		
		int age = 21;
		
		String strAge = Integer.toString(age);
	 
		int intAge = Integer.valueOf(strAge);
		
		System.out.println(strAge);
	}

}

 