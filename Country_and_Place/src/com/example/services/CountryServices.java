package com.example.services;

import java.util.List;

import com.example.Country;

public class CountryServices {
	 
public static void useDistinct(List<Country> countryList) {
		
		countryList.stream().distinct().forEach(System.out::println);
		
	}

}

