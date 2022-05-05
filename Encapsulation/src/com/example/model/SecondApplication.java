package com.example.model;

public class SecondApplication {

	public static void main(String[] args) {
		
		Student Shyam = new Student();
		
		Shyam.setRollNumber(1010);
		Shyam.setFirstName("Shyam");
		Shyam.setMarkScored(100);
		
	
		System.out.println("RollNumber:= " +Shyam.getRollNumber());
		
		System.out.println("FirstName:= " +Shyam.getFirstName());
		
		System.out.println("MarkScored:= " +Shyam.getMarkScored());

	}

}
