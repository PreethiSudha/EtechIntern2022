package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "preetz_creditcard")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {

	@Id
	@Column(name = "card_number")
	private long cardNumber;
	@Column(name = "card_holder_name")
	private String cardHolderName;
	@Column(name = "credit_limit")
	private double creditLimit;
	
}
