package com.training;
import java.util.*;
import com.training.exception.RangeCheckException;
import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;

public class Application {

	public static void main(String[] args) {
	
		Student ram=null;
		try {
			ram = new Student(1010, "Ram", -99);
		} catch (RangeCheckException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		StudentService service = new StudentService(ram);
		
		System.out.println(service.sendDetails());
		
		Student magesh = new Student();
		magesh.getRollNumber();
		magesh.getFirstName();
		magesh.getMarkScored();
		
		
		StudentService service2 = new StudentService(ram);
		
		try {
			
			System.out.println("Grade :=" +service2.findRank());
		} 
		catch (Throwable e)
		{			System.err.println("Name is not passed");
			
			//e.printStackTrace();
		}

		ExceptionHandling exHandling = new ExceptionHandling();
		exHandling.usingArrayIndexException(args);
		exHandling.usingNumberFormatException("45");
		exHandling.usingFinallyBlock();
		exHandling.underStandFinallyBlock();
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter Number:");
			int num = sc.nextInt();
			
			System.out.println(num);
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
