package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

	//@EntityGraph which is used to reduce the number of sql codes to print on the console and 
	//avoid n+1 select query problems
	
	//@EntityGraph(attributePaths= {"user", "city"} , type = EntityGraph.EntityGraphType.LOAD)
	//List<Address> findAll();

	@EntityGraph(attributePaths= {"user"} , type = EntityGraph.EntityGraphType.FETCH)
	List<Address> findAll();
	
	//Fetch is a default lazy entity graph type which contains a few records
}
