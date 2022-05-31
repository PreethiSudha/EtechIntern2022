package com.training.service;
import java.util.List;

import com.training.entity.Country;

import java.util.stream.Collectors;
public class CountryService {

	public  void findByCountry(List<Country> list, String country) {
		List<String> places = list.stream().filter(e -> e.getCountry().equalsIgnoreCase(country))
							.map(e -> e.getPlace()).collect(Collectors.toList());
		System.out.println(country +" = ");
		places.forEach(System.out::println);
	}
	
	public  void findPopulationCount(List<Country> list, String country) {
		Long population = list.stream().filter(e -> e.getCountry().equalsIgnoreCase(country))
				.mapToLong(e-> e.getPopulation()).sum();
		System.out.println(country +" = " +population);
	}
	
	public void findCountryAndCityCount(List<Country> list, String country) {
		Long count = list.stream().filter(e -> e.getCountry().equalsIgnoreCase(country)).count();
		System.out.println(country +" = " +count);
	}
}
