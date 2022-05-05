package com.training;

import java.util.Optional;

public class UsingOptional {
	
	public static Optional<String> getValue(int key){
		
		//.of => it creates optional value
		//.empty => it creates optional empty
		// these both are used to create optional
		
		Optional<String> response = Optional.empty();
		if(key==1) {
			return response = Optional.of("Hi");
		}
		return response;
	}
	
	public static Object getString(int key) {
		switch (key){
		case 1:
			return new String("Chocobar");
		case 2:
			return new StringBuffer("Cassatta");
		case 3:
			return new StringBuilder("ButterScotch");
		default:
			return null;
		}
	}

	public static void main(String[] args) {
			//will throw null pointer exception for values 4 and above
		System.out.println(getString(2).toString());
			
		//to avoid nullpointerexception and return a default value
		//new feature of Java 8 Optional is used
		
		
		//these 3 ways are used to handle the values to be present or not
	//way1
		Optional<Object> optional1 = Optional.ofNullable(getString(3));
		System.out.println(optional1.orElse("Vannila").toString());
		// if we avoid .toString() , we will get nullPointer exception
	
	//way2
		Optional<Object> optional2 = Optional.ofNullable(getString(4));
		if(optional2.isPresent()) {
			System.out.println("Value is Present" +optional2.get());
		}
		else {
			System.out.println("Value is not Present");
		}
		
	//way3
		Optional<Object> optional3 = Optional.ofNullable(getString(3));
		optional3.orElseThrow(() -> new RuntimeException("No object For Value 4 Try Again"));
		
	//using the lambda expressions with optional
		Optional<String> resp = getValue(2);
		if(resp.isPresent()) {
			System.out.println(resp.get().toString());
		}else {
		System.out.println("Invalid Choice Enter 1");
		}
		
		Optional<String> resp1 = getValue(1);
		if(resp1.isPresent()) {
			System.out.println(resp1.get().toString());
		}else {
			System.out.println("Invalid Choice Enter 1");
		}
	}

}
