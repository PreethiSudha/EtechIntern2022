package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level=AccessLevel.PRIVATE)
@Table(name = "preetz_trip_details_2022")
public class TripDetail {
 
	@Id
	@Column(name="trip_id")
	int tripId;
	
	@Column(name="driver_id")
	int driverId;
	
	@Column(name="trip_date")
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate tripDate;
	
	@Column(name="amount")
	double amount;
	
	
}
