package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {
		
		String dateOfBirth = "2000-11-28";
		
		Student preetz = new Student();
		 
		preetz.setRollNumber(52);
		preetz.setStudentName("Preetz");
		preetz.setDateOfBirth(LocalDate.parse(dateOfBirth));
		preetz.setDateOfJoining(LocalDateTime.now());
		
		System.out.println("Preetz : " +preetz.getDateOfBirth());
		System.out.println("Year : " +preetz.getDateOfBirth().getYear());
		System.out.println("Month :  " +preetz.getDateOfBirth().getMonthValue());
		//if you give getmonthValue, we will get the output in INTEGER type
		System.out.println("Month :  " +preetz.getDateOfBirth().getMonth());
		//suppose bwe use getmonth only, we will get the month name in string type
		System.out.println("Day : " +preetz.getDateOfBirth().getDayOfMonth());

		LocalTime startTime = LocalTime.of(9, 30);
		LocalTime endTime1 = LocalTime.of(8, 15);
		LocalTime endTime2 = startTime.plus(8, ChronoUnit.HOURS);
		LocalTime endTime3 = startTime.plusHours(8);
		//endtime2 and endtime3 are both same
		System.out.println("Start Time: " +startTime);
		System.out.println("EndTime1: " +endTime1);
		System.out.println("EndTime2: " +endTime2);
		System.out.println("EndTime3: " +endTime3);
		
	}

}
