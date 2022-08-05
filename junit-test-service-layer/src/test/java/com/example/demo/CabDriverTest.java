package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.hamcrest.Matchers.hasSize;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@AutoConfigureMockMvc
public class CabDriverTest {
	
	@Autowired
	MockMvc mock;
	
	@Autowired
	ObjectMapper objMapper;
	
	@MockBean
	CabDriverService service;
	
	private CabDriver candy;
	private CabDriver meen;
	private CabDriver suha;
	
	@BeforeAll
	@Test
	void init() {
		
		 candy = new CabDriver(1010, "Candy", 5614, "Chennai", LocalDate.of(2000, 10, 15), 4.5);
		 meen = new CabDriver(1011, "Meen", 8756, "Trichy", LocalDate.of(1999, 8, 25), 4.8);
		 suha = new CabDriver(1012, "Suha", 7896, "Salem", LocalDate.of(2000, 11, 28), 4.9);
		
	}
	
	@DisplayName("Test Find All method returns an array")
	@Test
	void testFindAll() throws Exception {
		
		List<CabDriver> list = new ArrayList<>();
		
		list.add(candy);
		list.add(meen);
		list.add(suha);
		
		given(service.findAll()).willReturn(list);
    	
    	mock.perform(MockMvcRequestBuilders.get("/api/v1/drivers")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(3)))
				.andExpect(jsonPath("$[1].driverName", is("Meen")));
     
		}

	@DisplayName("Test Add Method return status code 201 and returns the element added")
	@Test
	void testAdd() throws Exception { 
		
		CabDriver parth = new CabDriver(1015, "Partha", 8456, "Tirunelveli", LocalDate.of(1998, 5, 11), 3.5);
		given(service.save(parth)).willReturn(parth);
		
		mock.perform(MockMvcRequestBuilders.post("/api/v1/drivers")
	               .contentType(MediaType.APPLICATION_JSON)
	               .content(asJsonString(parth)))
	     			.andExpect(status().isCreated())
	     			.andExpect(content().contentType(MediaType.APPLICATION_JSON))
	     			.andExpect(jsonPath("$.driverName", is("Partha"))); 
	}

	public static String asJsonString(CabDriver obj) {
			
			ObjectMapper objectMapper = new ObjectMapper();
			try {
				objectMapper.convertValue(obj.getRating(), int.class);
				return objectMapper.writeValueAsString(obj);
			} catch (JsonProcessingException e) {
				throw new RuntimeException(e.getMessage());
			}
	}
}
 
