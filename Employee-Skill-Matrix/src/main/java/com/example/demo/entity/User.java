package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "pre_user")
@FieldDefaults(level=AccessLevel.PRIVATE)
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_login_id")
	int userLoginId;
	
	@Column(name="user_name")
	String userName;
	
	@Column(name="password")
	String password;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="created_date")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate createdDate;
	
	@Column(name="created_time")
	@DateTimeFormat(iso = ISO.TIME)
	LocalTime createdTime;
	
	@Column(name="created_by")
	String createdBy;
	
	@Column(name="token")
	String token;
	
	
}
