package com.demo.example;

public class Streams {
	
	private String Country;
	private String Place;
	private int Population;
	
	public Streams() 
	{
		super();	
	}
	
	public Streams(String country, String place, int population) {
		super();
		Country = country;
		Place = place;
		Population = population;
	}
	
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int population) {
		Population = population;
	}
	
	@Override
	public String toString() {
		return "Streams [Country=" + Country + ", Place=" + Place + ", Population=" + Population + "]";
	}
	

}
