package com.training.services;

public class ExceptionHandling {
	
	public void usingArrayIndexException(String[] args) {
		
		try {
			System.out.println(args[2]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Method requires three values to be passed [a, b, c]");
			
			e.printStackTrace();
		}
	}		
	

	public void usingNumberFormatException(String value) {
		
		int age=25;
		try {
			age = Integer.parseInt(value);
		}
		catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(age);
	}
	
	public void usingFinallyBlock() {
		int denominator = 0;
		try {
			System.out.println(4/denominator);
		}
		catch(ArithmeticException e) {
			System.err.println("Denominator should not be Zero");
		}
		finally {
			System.out.println("Inside Finally===");
		}
		System.out.println("thanks, Bye-Bye");
	}
	
	public String underStandFinallyBlock() {
		int denominator = 4;
		try {
			System.out.println(4/denominator);
		}
		catch(ArithmeticException e) {
			System.err.println("Denominator should not be Zero");
			return "Welcome";
			//throw new Exception();
		}
		finally {
			System.out.println("Inside Finally===");
		}
		System.out.println("thanks, Bye-Bye");
		return "thanks";
	}
}
