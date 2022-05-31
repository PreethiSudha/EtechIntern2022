package com.demo.example;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamsApplication {

	public static void main(String[] args) {

	List<Streams> tableList = Application.getStreams();		
	Scanner sc = new Scanner(System.in);
	
// Finding a place with the name of the country
	findPlaceByCountry(tableList, "Nepal");
//Getting the Country from User
	System.out.println("Enter the country for city name: ");
	String countryName=sc.next();
	findPlaceByCountry(tableList, countryName);
		
		
// Finding the occurrence of the country	
	countMethod(tableList,"USA");
//Getting  the Country name from the user for the no.of occurrence
	System.out.println("Enter the country to get the occurrence: ");
	String countryNameForPopulation=sc.next();
	countMethod(tableList,countryNameForPopulation);
		
//Finding the population of the country
	countryWithTotalPopulation(tableList,"USA");
//Getting the Country for the population	
	System.out.println("Enter the country for population: ");
	String counName=sc.next();
	countryWithTotalPopulation(tableList,counName);
		
	sc.close();
	}
	
	public static void findPlaceByCountry(List<Streams> obj,String searchName)
	{
		List<String> name=obj.stream().filter(e->e.getCountry().contains(searchName))
					 .map(d->d.getPlace())
					 .collect(Collectors.toList());
		name.forEach(System.out::println);	
	}
		 

	public static void countMethod(List<Streams> streamobj ,String searchName)
	{
		long countTimes=streamobj.stream().filter(e->e.getCountry().contains(searchName)).count();
		System.out.println(searchName+"occurs:"+countTimes+"times");
	}
			
	public static void countryWithTotalPopulation(List<Streams> objs,String searchName)
	{
			Long total=objs.stream().filter(e->e.getCountry().contains(searchName))
			    .mapToLong(d -> d.getPopulation()).sum();
			System.out.println(searchName+"total population"+total);
	}
	
}
