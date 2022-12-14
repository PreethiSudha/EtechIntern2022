package com.example.demo.entity;

import java.sql.Date;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)
public class EmployeeSkills {
	
	int empSkillId;
	int empId;
	int skillId;
	String skillName;
	String skillExperience;
	String status;
	String approvedBy;
	Date approvedDate;
	Date createdDate;
	Date modifiedDate;
}
