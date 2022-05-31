package com.example;

public class Country {
	
	private String countryName;
	private String placeName; 
	private int population;
	
	public Country() {
		super();
	}

	public Country(String countryName, String placeName, int population) {
		super();
		this.countryName = countryName;
		this.placeName = placeName;
		this.population = population;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", placeName=" + placeName + ","
				+ " population=" + population + "]";
	}
	
	
}
