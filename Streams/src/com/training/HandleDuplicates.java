package com.training;

import static java.util.stream.Collectors.*;
import java.util.*;

public class HandleDuplicates {

	public static void main(String[] args) {
		
		List<Integer> ageList = Arrays.asList(45,55,65,75,85,55,45);
		
		Set<Integer> filtered = new HashSet<>();
		
		List<Integer> list =
				ageList
				.stream()
				.filter(e->!filtered.add(e))
				.collect(toList());
				
		System.out.println(list);
		
		// returns only the values which are present more than only one time
		//[55,45]
		
		Set<Integer> set =
				ageList
				.stream()
				.filter(e->!filtered.add(e))
				.collect(toSet());
		
		System.out.println(set);
		
		// returns the values which are present one time and 
		// eventhough, if the values present more than one time , 
		// it returns the same value just at only one time
		// [65, 85, 55, 75, 45]
		
	}

}
