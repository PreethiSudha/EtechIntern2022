package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="preethi_life_insurance_2022")
@PrimaryKeyJoinColumn(name="id",referencedColumnName="policy_number")

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
