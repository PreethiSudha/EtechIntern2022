package com.example.demo.ifaces;

import java.util.List;

public interface CrudRepository<T> {

	public int add(T t);
	public List<T> findAll();
	public T findById(int id);
	public int delete(int id);
	public int update(T t);
}
