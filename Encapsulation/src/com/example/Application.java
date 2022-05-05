package com.example;

import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		
		Student ram = new Student();
		
		//ram.rollNumber = 101;
		
		//public method able to be access
		
		ram.setRollNumber(56);
		
		//default method unable to access=>
		//because student class is in com.example.model package
		//and Application is in com.example package
		
		System.out.println("RollNumber:= " +ram.getRollNumber());
		
		System.out.println("FirstName:= " +ram.getFirstName());
		
		System.out.println("MarkScored:= " +ram.getMarkScored());
		
		Student Shyam = new Student(490, "Shyam", 98, "Mech");
		
		System.out.println("RollNumber:= " +Shyam.getRollNumber());
		
		System.out.println("FirstName:= " +Shyam.getFirstName());
		
		System.out.println("MarkScored:= " +Shyam.getMarkScored());

	}

}