package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TripDetail;

@Repository
public interface TripDetailRepository extends JpaRepository<TripDetail, Integer> {

	TripDetail findByDriverId(int driverId);
	
}
