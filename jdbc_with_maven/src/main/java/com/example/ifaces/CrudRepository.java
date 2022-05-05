package com.example.ifaces;

import java.util.List;

import com.example.entity.Member;

public interface CrudRepository {

	public int add(Member obj);
	public List<Member> findAll();
	public int remove(int id);
	public Member findById(int id);
	public int update(int Id, Member member);	
	
}
