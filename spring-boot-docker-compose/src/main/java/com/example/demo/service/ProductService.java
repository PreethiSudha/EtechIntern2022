package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.ifaces.ProductRepository;
import com.example.demo.model.Product;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {


	private ProductRepository repo;
	
	public Product addProduct(Product entity) {
		return this.repo.save(entity);
	}
	
	public List<Product> findAll(){
		return this.repo.findAll();
	}
	
}
