package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@ToString
@Component
@Getter
public class Bill {
	
	Customer customer;
	Product product;
	
	@Autowired
	public void setCustomer(@Qualifier("magesh")Customer customer) {
		
		System.out.println("SET CUSTOMER CALLED ************");
		this.customer = customer ;
		
	}
	
	@Autowired
	public void setProduct(Product product) {
		
		System.out.println("SET PRODUCT CALLED ************");
		this.product = product ;
		
	}

}
