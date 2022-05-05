package com.example.demo;

public class Converter {
	
	public String convert(String str) {

	return str.toUpperCase();
	
	}
	
//	create a overloaded constructor
//	 public String convert(String str2) {
//	 
//	 return null;
//	 
//	 }
	 
	public double convert(double farenTemp) {
		
		return (farenTemp-32)*5/9;
	}
	
	public double convert(double amt, int frm) {
		
		double response = amt*100;
		
		if(frm>1) {
			
			return amt*100;
			
		}
		else
		{
			return amt*120;
		}
		}
	}



