package com.training.entity;

public class Country {

	
	private String country;
	private String place;
	private long population;
	
	
	public Country() {
		super();
	}


	public Country(String country, String place, long population) {
		super();
		this.country = country;
		this.place = place;
		this.population = population;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public long getPopulation() {
		return population;
	}


	public void setPopulation(long population) {
		this.population = population;
	}
		
}