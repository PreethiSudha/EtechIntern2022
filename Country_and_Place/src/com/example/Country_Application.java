package com.example;

import java.util.Arrays;
import java.util.List;
import com.example.services.CountryServices;

public class Country_Application {

	public static void main(List<Country> countries) {
		
		for(Country eachcountry:countries) {
			System.out.println(eachcountry);
			System.out.println("===============================");	
		}
		//did not have any datas stored in the list
		
		//to store the dats into the list we created,
		
		Country c1 = new Country ("USA", "Kansas City", 509157);
		Country c2 = new Country("India", "Chennai", 7090000);
		Country c3 = new Country("USA", "Los Angeles", 3970000);
		Country c4 = new Country("Nepal", "Kathmandu", 1000000);
		Country c5 = new Country("India", "Kolkata", 14900000);
		Country c6 = new Country("USA", "Denver", 706000);
		
		
		List<Country> countryList = Arrays.asList(c1, c2, c3, c4, c5, c6);
		
		int key=1;
		switch(key) {
		case 1:
			findPlaceFromCountry(countryList);
			break;
		
		case 2:	
			countCountryPopulation(countryList, int, String);
			break;
		
		case 3:
			countCountryByName(countryList, "USA");
			break;
			
		default:
			break;
	}
	}

	public static void findPlaceFromCountry(List<Country> countryList) {
		 System.out.println("Using Streams");
		((List<Country>)countryList).findPlacefromCountry(c1).forEach(System.out::println);	
	}
	
	public static void countCountryPopulation(List<Country> countryList, int Population, String srchString) {
		
			long count1 = countryList.stream().filter(e->e.getCountryName().contains(srchString)).count();
			long count2 = countryList.stream().filter(e->e.getPopulation().int(population)).count();
			
			System.out.println(srchString + count1  + Population +count2 );
				
	}
	
	public static void countCountryByName(List<Country> countryList, String srchString) {
		
			long count = countryList.stream().filter(e->e.getCountryName().contains(srchString)).count();
			
			System.out.println(srchString + " Occurs " + count + " times ");
			
			}
		
	}



