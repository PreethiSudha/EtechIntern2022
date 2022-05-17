package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {

	List<Driver> findByDriverName(String srchName);
	
	//List<Driver> findByFirstName(String srchName);
	//exception thrown as no property name in the name of Firstname
	
	List<Driver> findByMobileNumber(long mobileNumber);
	
	@Query(value = "from Driver where rating =:srchValue")
	List<Driver> searchByRating(@Param("srchValue")double rating);
	
	@Query(value = "update Driver set rating =:updatedRating where driverId =:srchId")
	@Modifying
	@Transactional
	int modifyRating(@Param("srchId")int driverId , @Param("updatedRating")double updatedRating);
//why we use int instead of using List here means update will give us count of the rows 
//or records which are updated
//and update have a return type of integer so it always return the values in int type

	
}
