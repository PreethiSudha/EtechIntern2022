package com.training;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
public class UsingPredicate {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("india", "srilanka", "indonesia", "china", "italy", "USA", "africa");
		
		Predicate<String> containsChar = (country)->country.toUpperCase().startsWith("I");
		
		Consumer<String> consumer = (value) -> System.out.println(value);
		
		//lambda expression taking consumer as an argument here
		
		names.forEach(consumer);
		
		System.out.println("=========================");
		
		names.forEach((value) -> System.out.println(value));
		
		// the last two names.forEach statement is same , just to make the code concise 
		//we used to write the code in just a single line.
		
		System.out.println("=========================");
		
		Consumer<String> consumer1 = (value)->
		{
			if(containsChar.test(value)) {
				System.out.println(value);
			}
		};
		
		names.forEach(consumer1);
	}

}
