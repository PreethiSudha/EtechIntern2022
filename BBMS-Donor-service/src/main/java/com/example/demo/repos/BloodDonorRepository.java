package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.BloodDonor;

public interface BloodDonorRepository extends JpaRepository<BloodDonor, Integer> {

	BloodDonor[] findByBloodGroup(String name);
	
	BloodDonor[] findByLocation(String place);

	BloodDonor[] deleteByMobileNumber(long mblNum);
	
	BloodDonor[] deleteByEmail(String email);
	
	//BloodDonor[] updateByLocation(String loc);
	
	@Query(value = "from Donor where location =:srchLoc")
	BloodDonor[] searchByLocation(@Param("srchLoc")String location);
	
	@Query(value = "update BloodDonor set location =: newLoc where location =:srchLoc")
	@Modifying
	@Transactional
	BloodDonor[] modifyLocation(@Param("srchLoc")String location , @Param("newLoc")String newLoc);

}
