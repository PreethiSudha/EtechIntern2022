package org.example;

public class Greeting {
 
	public String getMessage() {
		
		return "Hello";
		
	}
	
	public String birthdayWish(String name) {
		
		return "ramesh";
				
	}
	
	public String birthdayWishSufWithName(String name){
		
		String message = "Happy Birthday " +name;
		
		return message;
	}
}
