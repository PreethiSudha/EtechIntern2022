package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Preetz_Doctor")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {

	@Id
	@Column(name="doctor_id")
	int doctorId;
	
	@Column(name="doctor_name")
	String doctorName;
	
	@Column(name="department")
	String department;
	
	@Column(name="phone_number")
	long phonenumber;
	
}
