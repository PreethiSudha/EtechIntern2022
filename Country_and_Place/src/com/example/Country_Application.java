package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.services.CountryService;
import com.example.Country;

public class Country_Application {
	
	public static void main(String[] args) {
		
		//did not have any datas stored in the list
		//to store the dats into the list we created,
		
		Country KansasCity = new Country ("USA", "KansasCity", 509157);
		Country Chennai = new Country("India", "Chennai", 7090000);
		Country LosAngeles = new Country("USA", "LosAngeles", 3970000);
		Country Kathmandu = new Country("Nepal", "Kathmandu", 1000000);
		Country Kolkata = new Country("India", "Kolkata", 14900000);
		Country Denver = new Country("USA", "Denver", 706000);
		
		List<Country> countryList = new ArrayList<>();
		
		countryList.add(KansasCity);
		countryList.add(Chennai);
		countryList.add(LosAngeles);
		countryList.add(Kathmandu);
		countryList.add(Kolkata);
		countryList.add(Denver);
		
		CountryService service = new CountryService();
		
		service.findPlaceFromCountry(countryList, "USA");
		service.countCountryPopulation(countryList, "India");
		service.countCountryByName(countryList, "Nepal");
		
		}
	
}

	



