package com.training;

import java.util.HashSet;
import java.util.Set;

import com.training.model.Student;

public class HashSetApplication {

	public static void main(String[] args) {

		Student ram = new Student(101, "Ram", 98);
		Student shyam = new Student(102, "Shyam", 99);
		Student maggie = new Student(103, "Maggie", 100);
		Student femi = new Student(103, "Maggie", 100);
		
		Set<Student> set = new HashSet<>();
		
		set.add(ram);
		set.add(shyam);
		set.add(maggie);
		set.add(femi);
		
		//System.out.println(set);
		
		System.out.println(set.size());
	
		for(Student eachStudent:set) {
			System.out.println(eachStudent.getName());
		}

	}

}
