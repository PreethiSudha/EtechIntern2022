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

@Entity
@Table(name = "pre_emp_designation")
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Employee_Designation {


	@Id
	@Column(name="emp_designation_id")
	int empDesignationId;
		
	@Column(name="emp_designation")
	String empDesignation;
	
}
