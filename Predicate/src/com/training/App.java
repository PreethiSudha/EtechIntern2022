package com.training;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("India", "Srilanka", "Indonesia", "China", "Italy", "USA", "Africa");
		
   		names.forEach(value -> System.out.println(value));
   		
   		System.out.println("=========================");
   		
		for(String eachName:names ) {
			System.out.println(eachName);
		}
		
   		System.out.println("=========================");
		
		//Method Reference
		// (::) refers that we just pass the value not calling the value.
		names.forEach(System.out::println);
		
		//Above 3 methods are going to be same and giving us the same output 
		//but the third mathod is much more concise and efficiently works. 
	}
}
