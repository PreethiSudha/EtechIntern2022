package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Preethi_Donor_2022" )
public class BloodDonor {

	
	@Column(name = "donar_name")
	String donarName;
	
	@Id
	@Column(name = "mobile_number")
	long mobileNumber;
	
	@Column(name = "blood_group")
	String bloodGroup;
	
	@Column(name = "location")
	String location;
	
	@Column(name = "date_of_birth")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate dateOfBirth;
	
	@Column(name = "email")
	String email;
	
}
