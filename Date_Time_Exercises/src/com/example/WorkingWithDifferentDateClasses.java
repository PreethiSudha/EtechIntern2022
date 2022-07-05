package com.example;

import java.time.*;

public class WorkingWithDifferentDateClasses {

	public static void main(String[] args) {
		
		//Step-1 creating UTIL Date
		java.util.Date date1 = new java.util.Date();
		System.out.println(date1);
		System.out.println(date1.getTime());
		System.out.println("===========================");
		
		//Step-2 creating SQL Date
		java.sql.Date date2 = new java.sql.Date(10203030);
		System.out.println(date2);
		System.out.println("===========================");
		
		//Step-3 UTIL date to SQL Date
		java.sql.Date date3 = new java.sql.Date(date1.getTime());
		System.out.println(date3);
		System.out.println("===========================");
		
		//Step-4 SQl Date to Local Date
		LocalDate localDate = date3.toLocalDate();
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getMonthValue());
		System.out.println("===========================");
		
		//Step-5 Local Date to SQL Date
		java.sql.Date sqlDate2 = java.sql.Date.valueOf(localDate);
		System.out.println("SQL Date 2 : " +sqlDate2);
		
		
	}

}
