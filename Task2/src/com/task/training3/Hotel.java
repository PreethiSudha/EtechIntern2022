package com.task.training3;

public class Hotel {
	private String hotelName;
	private String hotelAddress;
	private String hotelDishTypes;
	private String hotelDishesName;
	private String hotelTimings;
	
	
	public Hotel(String hotelName, String hotelAddress, String hotelDishTypes, String hotelDishesName,
			String hotelTimings) {
		super();
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.hotelDishTypes = hotelDishTypes;
		this.hotelDishesName = hotelDishesName;
		this.hotelTimings = hotelTimings;
	}


	public String getHotelName() {
		return hotelName;
	}


	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	public String getHotelAddress() {
		return hotelAddress;
	}


	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}


	public String getHotelDishTypes() {
		return hotelDishTypes;
	}


	public void setHotelDishTypes(String hotelDishTypes) {
		this.hotelDishTypes = hotelDishTypes;
	}


	public String getHotelDishesName() {
		return hotelDishesName;
	}


	public void setHotelDishesName(String hotelDishesName) {
		this.hotelDishesName = hotelDishesName;
	}


	public String getHotelTimings() {
		return hotelTimings;
	}


	public void setHotelTimings(String hotelTimings) {
		this.hotelTimings = hotelTimings;
	}
	
	
	
}
