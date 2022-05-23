package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@DiscriminatorValue(value="ENTITY")
public class LifeInsurance extends Insurance{

	@Column(name="age")
	private int age;
	@Column(name="profile")
	private String profile;
	
	public LifeInsurance(int policyNumber, String policyHolderName, int age, String profile) 
	{
		super(policyNumber, policyHolderName);
		this.age = age;
		this.profile = profile;
	}		
}
