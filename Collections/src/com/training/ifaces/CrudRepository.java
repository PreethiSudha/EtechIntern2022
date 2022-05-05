package com.training.ifaces;

import com.training.model.*;
import java.util.*;

public interface CrudRepository {

		public boolean add(Book book);
		public Book findByBookId(int id);
		public boolean remove(Book book);
		public List<Book> findAll();
		public Book update(Book book);
		public Book update (Book oldbook, Book recentbook);
		
	}



