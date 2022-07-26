package com.example.demo.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class BloodDonor {

	
	
	String donarName;
	
	
	long mobileNumber;
	
	
	String bloodGroup;
	
	
	String location;
	
	
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate dateOfBirth;
	
	
	String email;
	
}
