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
	}

}
