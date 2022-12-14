package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "pre_emp_details")
@FieldDefaults(level=AccessLevel.PRIVATE)

public class Employee_Details {

	@Id
	@Column(name="emp_id")
	int empId;
	
	@Column(name="emp_name")
	String empName;
	
	@Column(name="emp_designation_id")
	int empDesignationId;
	
	@Column(name="emp_doj")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate empDoj;
	
	@Column(name="manager")
	String manager;
}
