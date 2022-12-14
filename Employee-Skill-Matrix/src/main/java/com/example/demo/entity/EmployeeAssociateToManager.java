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
@Table(name = "pre_emp_asso_to_mngr")
@FieldDefaults(level=AccessLevel.PRIVATE)
public class EmployeeAssociateToManager {

	@Id
	@Column(name = "emp_id")
	int empId;
	
	@Column(name = "emp_name")
	String empName;
	
	@Column(name = "manager_id")
	int managerId;
	
	@Column(name= "manager_name")
	String managerName;
	
}
