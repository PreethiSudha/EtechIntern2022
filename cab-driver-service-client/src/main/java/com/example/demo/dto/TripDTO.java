package com.example.demo.dto;

import java.util.Set;

import com.example.demo.enitity.TripDetail;
import com.example.demo.entity.CabDriver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TripDTO {
	
	private CabDriver driver;
	private Set<TripDetail> trip;

}
