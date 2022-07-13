package com.example.demo.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Data
@NoArgsConstructor
@AllArgsConstructor

@FieldDefaults(level=AccessLevel.PRIVATE)
@Component
public class CabDriver {

	int driverId;
	String driverName;
	long mobileNumber;
	String location;
	LocalDate dateOfBirth;
	double rating;
	
}
