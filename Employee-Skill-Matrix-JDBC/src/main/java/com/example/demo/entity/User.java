package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)
public class User {
	
	
	int userLoginId;
	String userName;
	String password;
	String firstName;
	String lastName;
	LocalDate createdDate;
	LocalTime createdTime;
	String createdBy;
	String token;

}
