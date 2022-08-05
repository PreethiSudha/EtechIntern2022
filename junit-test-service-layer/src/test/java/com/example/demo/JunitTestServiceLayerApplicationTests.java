package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.persistence.EntityNotFoundException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class JunitTestServiceLayerApplicationTests {
	
	@Autowired
	CabDriverService service;
	
	@BeforeAll
	void setUp() {
		CabDriver driver= new CabDriver(111,"Sushmi",473893,"Chennai",LocalDate.of(2000, 10, 13),4.5);
		service.save(driver);
	}
	
//	@Test
//	@DisplayName("Find All Method should return an Empty Array")
//	void testFindAllFailure() {
//		assertTrue(service.findAll().isEmpty());
//	}

	@Test
	@DisplayName("Find All Method should return an Array with Element")
	void testFindAllSuccess() {
		assertFalse(service.findAll().isEmpty());
	}
	
	@Test
	@DisplayName("Find By Id should return an Element with the given id")
	void testFindById() {
		CabDriver driver = service.findById(201).orElseThrow(EntityNotFoundException::new);
		//assertEquals("Jagadeesh", service.findById(1010).get().getDriverName());
		assertEquals("Jagadeesh", driver.getDriverName());
	}
}
