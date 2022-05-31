package com.training;

import java.util.ArrayList;
import java.util.List;
import com.training.entity.Country;
import com.training.service.CountryService;

public class Application {

	public static void main(String[] args) {
				
		Country kanasCity=new Country("USA", "KanasCity", 501957);
		Country chennai =new Country("India", "Chennai", 7090000);
		Country losAngeles=new Country("USA", "Los Angeles", 3970000);
		Country kathumandu=new Country("Nepal","Kathumandu",1000000);
		Country kolkata=new Country("India","Kolkata",14900000);
		Country denver=new Country("USA", "Denver", 706000);
		
		List<Country> list = new ArrayList<>();
		
		list.add(kanasCity);
		list.add(chennai);
		list.add(losAngeles);
		list.add(kathumandu);
		list.add(kolkata);
		list.add(denver);
		
		CountryService service = new CountryService();
		
		service.findByCountry(list, "India");
		service.findPopulationCount(list, "USA");
		service.findCountryAndCityCount(list, "Nepal");
	}

} 

