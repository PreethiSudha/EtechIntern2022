package com.training;

import java.util.Set;
import java.util.TreeSet;

import com.training.model.Student;

public class TreeSetApplication {

	public static void main(String[] args) {
		
		Student ram = new Student(101, "Ram", 98);
		Student shyam = new Student(102, "Shyam", 99);
		Student maggie = new Student(103, "Maggie", 100);
		Student femi = new Student(103, "Maggie", 100);
		
		Set<Student> set = new TreeSet<>();
		
		set.add(ram);
		set.add(shyam);
		set.add(maggie);
		set.add(femi);
		
		//System.out.println(set);
		
		System.out.println(set.size());
		
		for(Student eachStudent:set) {
			System.out.println(eachStudent.getMarkScored());
		}

	}

}
