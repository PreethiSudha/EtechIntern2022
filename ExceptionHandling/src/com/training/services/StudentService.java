package com.training.services;

import com.training.model.Student;

public class StudentService {
	
	private Student student;

	public StudentService() {
		super();
	}

	public StudentService(Student student) {
		super();
		this.student = student;
	}
	//Apply the Handle rule of Exception Handling
	
	public String sendDetails() {
		
		String name = null;
		try {
			
		name =  this.student.getFirstName();
		
		} catch (NullPointerException e) {
			
			System.err.println("Student Object is not passed check again");
		}
		return name;
}
	
	//Apply the Declare rule of Exception Handling
	
		public String findRank() throws Throwable{
			
			String grade = "O";
			
			if(this.student.getMarkScored()>90) {
				
				grade = "A";
			}
			
			return grade;
			
			
		}
}