package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CreditCard;
import com.example.demo.services.CreditCardService;

@RestController
@RequestMapping(path = "/api/v1")
public class CreditCardController {

	 private CreditCardService service;

	public CreditCardController(CreditCardService service) {
		super();
		this.service = service;
	}
	 
	@GetMapping(path = "/creditcards")
	 public List<CreditCard> findAll(){
		 return this.service.getAll();
	 }
	 
	@GetMapping(path = "/creditcards/{cardNumber}")
	 public CreditCard findById(@PathVariable("cardNumber") long id) {
		 return this.service.getById(id);
	 }
	 
	@PostMapping(path = "/creditcards")
	 public ResponseEntity<CreditCard> add(@RequestBody CreditCard entity){
		 CreditCard card = this.service.addCard(entity);
		 return ResponseEntity.status(HttpStatus.CREATED).body(card);
	 }
	
	@DeleteMapping(path = "/creditcards")
    public ResponseEntity<String> remove(@RequestBody CreditCard entity) {
		this.service.remove(entity);
		return ResponseEntity.status(HttpStatus.OK).body("one row deleted");
	}
}
