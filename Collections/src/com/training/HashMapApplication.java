package com.training;
import java.util.*;

import com.training.model.Student;
public class HashMapApplication {

	public static void main(String[] args) {
		
		Student ram = new Student(101, "Ram", 97);
		Student shyam = new Student(102, "Shyam", 98);
		Student maggie = new Student(103, "Maggie", 99);
		Student femi = new Student(104, "Femi", 100);

		HashMap<Integer,Student> map = new HashMap<>();
		
		System.out.println(map.put(1, ram));
		System.out.println(map.put(2, shyam));
		System.out.println(map.put(3, maggie));
		System.out.println(map.put(3, femi));
		
		//if the put method returns the output as null, it means the key value is unique.
		System.out.println("=============================");
		
		Student added = map.put(3, femi);
		
		if(added != null) {
			map.put(4, added);
		}
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		
		//once the key value gets duplicated, the old value gets replaced with new value.
		
		System.out.println("=============================");
		
		map.put(1, ram);
		map.put(2, shyam);
		map.put(3, femi);
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		
		System.out.println("=============================");
		
		Set<Integer> keys = map.keySet();
		
		for(Integer key: keys) {
		System.out.println(map.get(key));
		}
	
		System.out.println("=============================");
		
		Collection<Student> list = map.values();
		//here Collection is a type of values , its not a top level Collection.
		for(Student eachStudent :list) {
			System.out.println(eachStudent);
		}
		
		System.out.println("=============================");
		
		
		System.out.println("Both key and Values: ");
		
		Set<Map.Entry<Integer, Student>> list2 = map.entrySet();
		
		for(Map.Entry<Integer, Student> eachEntry : list2) {
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
			
		}
		
	}
	
}