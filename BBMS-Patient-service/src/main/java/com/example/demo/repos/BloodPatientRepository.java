package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BloodPatient;

@Repository
public interface BloodPatientRepository extends JpaRepository<BloodPatient, Integer> {
	
	BloodPatient findByBloodGroup(String name);

	BloodPatient findByLocation(String place);

}
