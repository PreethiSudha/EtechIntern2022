package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="preetz_cab_driver")
public class CabDriver {
	
	@Id
	@Column(name="driver_id")
	int driverId;
	
	@Column(name="driver_name")
	String driverName;
	
	@Column(name="mobile_number")
	long mobileNumber;
	
	@Column(name="location")
	String location;
	
	@Column(name="date_of_birth")
	@DateTimeFormat(iso =ISO.DATE)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	LocalDate dateOfBirth;
	
	@Column(name="rating")
	double rating;
	
	
	
}
