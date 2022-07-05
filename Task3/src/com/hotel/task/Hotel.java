package com.hotel.task;

public class Hotel {
	
	private String hotelName;
	private long hotelNum;
	private double hotelAmount;
	
	//super class
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Hotel(String hotelName, long hotelNum, double hotelAmount) {
		super();
		this.hotelName = hotelName;
		this.hotelNum = hotelNum;
		this.hotelAmount = hotelAmount;
		
	}
	
	
	
	public String getHotelName() {
		return hotelName;
	}
	
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public long getHotelNum() {
		return hotelNum;
	}
	
	public void setHotelNum(long hotelNum) {
		this.hotelNum = hotelNum;
	}
	
	public double getHotelAmount() {
		return hotelAmount;
	}
	
	public void setHotelAmount(double hotelAmount) {
		this.hotelAmount = hotelAmount;
	}
	
	
}
