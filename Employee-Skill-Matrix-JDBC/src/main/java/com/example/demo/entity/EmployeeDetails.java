package com.example.demo.entity;

import java.time.LocalDate;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)
public class EmployeeDetails {
	
		int empId;
		String empName;
		int empDesignationId;
		LocalDate empDateOfJoining;

}
