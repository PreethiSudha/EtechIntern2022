package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity

@AllArgsConstructor
@NoArgsConstructor
@Table(name="preetz_trip_history")
public class TripHistory {

	@Id
	@Column(name="trip_id")
	int tripId;
	@Column(name="trip_date_time")
	LocalDate tripDateTime;
	@Column(name="source")
	String source;
	@Column(name="destination")
	String destination;
	@Column(name="amount")
	double amount;
	
	
	
}
