package com.training;

public class Address {
	
	private int doorNo;
	private String streetName;
	private String place;
	private String city;
	private int pinCode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int doorNo, String streetName, String place, String city, int pinCode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.place = place;
		this.city = city;
		this.pinCode = pinCode;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getpinCode() {
		return pinCode;
	}

	public void setpinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
	
	
	
	
	

}
