package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class BookController {

	@GetMapping(path = "/books")
	public List<String> getBooks(){
		log.info("Get Books Called:");
		return Arrays.asList("Head First Java", "Spring In Action", "Thinking In Java");
	}
	
	@GetMapping(path = "/books/{id}")
	public String getBookById(@PathVariable int id) {
		if(id==1) {
			return "Head First Java";
		}else {
			return "Thinking In Java";
		}
	}
}
