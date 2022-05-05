package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		
		Student Loch = new Student(101, "Loch", LocalDate.of(2022, 11, 28), 
				LocalDateTime.of(2015, Month.JUNE,5,9,15));
		
		Student Rock = new Student(112, "Rock", LocalDate.of(2021, 10, 15), 
				LocalDateTime.of(2016, Month.AUGUST, 01, 10, 30));
		
		System.out.println("Loch's Year Of Birth:" +Loch.getDateOfBirth().getYear());
		
		System.out.println("Loch's First Birthday:" +Loch.getDateOfBirth().plus(1, ChronoUnit.YEARS));
		
		System.out.println("Rock's year Of Birth:" +Rock.getDateOfBirth().getYear());
		
		System.out.println("Rock's Previous Birthday:" +Rock.getDateOfBirth().minus(1, ChronoUnit.YEARS));

	}

}
