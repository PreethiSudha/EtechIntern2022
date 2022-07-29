package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.BloodDonor;

@Repository
public interface BloodDonorRepository extends JpaRepository<BloodDonor, Integer> {

	BloodDonor[] findByBloodGroup(String name);
	
	BloodDonor[] findByLocation(String place);

	BloodDonor[] deleteByMobileNumber(long mblNum);
	
	BloodDonor[] deleteByEmail(String email);
	
	//BloodDonor[] updateByLocation(String loc);
	
//	@Query(value = "from Donor where location =:srchLoc")
//	BloodDonor[] searchByLocation(@Param("srchLoc")String location);
//	
//	@Query(value = "update BloodDonor[] set location =: newLoc where location =:srchLoc")
//	@Modifying
//	@Transactional
//	BloodDonor[] modifyLocation(@Param("srchLoc")String location , @Param("newLoc")String newLoc);

	
	@Query(value = "update BloodDonor set location =:location where mobileNumber =:mobileNumber")
	@Modifying
	@Transactional
    int modifyLocation(@Param("mobileNumber")long mobileNumber, @Param("location")String updateLocation);
	
}
