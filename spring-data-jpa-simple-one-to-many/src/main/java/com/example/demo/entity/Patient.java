package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
	
@Entity
@Table(name="Preethi_Patient_One_To_Many")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

	@Id
	@Column(name="patient_id")
	int patientId;
	
	@Column(name="patient_name")
	String patientName;
	
	@Column(name="phone_number")
	long phoneNumber;
	
}
