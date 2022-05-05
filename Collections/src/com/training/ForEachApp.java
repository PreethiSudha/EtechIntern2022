package com.training;

import java.util.ArrayList;
import java.util.List;

import com.training.model.Student;

public class ForEachApp {

	public static void main(String[] args) {
		String[] names = {"Ram", "Shyam", "Siva"};
		for(String eachName:names) {
			System.out.println(eachName);
		}
		
		// to create a for loop , we must use the datatypes what we use 
		//that will be use at the left side of the for loop condition and then write the reference variable
		List<Student> studList = new ArrayList<>();
		for(Student eachStudent:studList) {
			System.out.println(eachStudent);
		}
		//in the array list or list we cant use the datatype instead we use the list type i.e, Student
	}

}
