package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Preethi_Patient_2022")
public class BloodPatient {

	@Id
	@Column(name = "patient_id")
	int patientId;
	
	@Column(name = "patient_name")
	String patientName;
	
	@Column(name = "blood_group")
	String bloodGroup;
	
	@Column(name = "age")
	int age;

	@Column(name = "location")
	String location;
	
	@Column(name = "mobile_number")
	long mobileNumber;
	
}
