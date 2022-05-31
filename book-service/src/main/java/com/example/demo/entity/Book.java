package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Data
@NoArgsConstructor 
@AllArgsConstructor
@Entity
@Table(name="preethi_book")
public class Book {

	
	@Id
	@Column(name="book_id")
	int bookId;
	@Column(name="book_name")
	String bookName;
	@Column(name="author_name")
	String authorName;
	@Column(name="book_cost")
	double bookCost;
	
}
