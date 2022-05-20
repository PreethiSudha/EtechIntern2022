package com.example.demo.entity;

import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Preethi_Doctor_One_To_Many")

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
	
	
	@OneToMany(targetEntity=Patient.class,fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	//refernced column is the primary key of the Doctor table
	//join column will be created in the target table
	@JoinColumn(name="doctor_ref" , referencedColumnName="doctor_id")
	List<Patient> patientList;
	//one to many, one doctor has many patients.
	
}
