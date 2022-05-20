package com.example.demo.ifaces;

import java.util.List;

public interface CrudRepository<T> {

	public int add(T t);
	public List<T> findAll();
//	public int remove(int id);
//	public Optional<Product> findById(int id);
//	public int update(int Id,T obj);	
	public T findById(int id);
	public int update(T t);
	public int remove(int id);
	
	
}
