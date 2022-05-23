package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@DiscriminatorValue(value="LIFE")
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
