package com.example.services;

import java.util.List;
import java.util.stream.Collectors;

import com.example.Country;

public class CountryService {
	
	public void findPlaceFromCountry(List<Country> countryList, String Country) {
		List<String> places = countryList.stream()
				.filter(e->e.getCountryName().equalsIgnoreCase(Country))
				.map(e->e.getPlaceName())
				.collect(Collectors.toList());
		 System.out.println(Country +" = ");
		 places.forEach(System.out::println);
	}
	
	public void countCountryPopulation(List<Country> countryList, String Country) {
			Long population = countryList.stream()
					.filter(e->e.getCountryName().equalsIgnoreCase(Country))
					.mapToLong(e->e.getPopulation())
					.sum();
			System.out.println(Country +"=" +population);			
	}
	
	public void countCountryByName(List<Country> countryList, String Country) {
			long count = countryList.stream()
					.filter(e->e.getCountryName().equalsIgnoreCase(Country))
					.count();
			System.out.println(Country + " Occurs " + count + " times ");
			
	}
		
}


