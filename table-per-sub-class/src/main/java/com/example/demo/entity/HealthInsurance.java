package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="preethi_health_insurance_2022")
@PrimaryKeyJoinColumn(name="id",referencedColumnName="policy_number")

public class HealthInsurance extends Insurance{

	
	@Column(name="age")
	private int age;
	@Column(name="status")
	private String status;
	
	public HealthInsurance(int policyNumber, String policyHolderName, int age, String status)
	{
		super(policyNumber, policyHolderName);
		this.age = age;
		this.status = status;
	}	
}
