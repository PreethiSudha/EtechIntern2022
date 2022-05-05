package com.example.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.example.entity.Member;
import com.example.ifaces.CrudRepository;

public class MemberRepository implements CrudRepository {

	private Connection con;
	
	public MemberRepository(Connection con) {
		super();
		this.con =con;
	}

	public int add(Member obj) {
		
		int rowAdded = 0;	
		
		String str = "insert into preethimembertable values (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try(PreparedStatement Ps = con.prepareStatement(str)){
			
			Ps.setInt(1, obj.getMemberId());
			Ps.setString(2, obj.getMemberName());
			Ps.setString(3,  obj.getMemberAddress());
			Ps.setDouble(4,  obj.getFeesPaid());
			Ps.setInt(5,  obj.getMaxBookAllowed());
			Ps.setDouble(6,  obj.getPenaltyAmount());
			Ps.setDate(7, Date.valueOf(obj.getAccountOpenDate()));
			Ps.setString(8, obj.getMemberShipType());
			
			rowAdded = Ps.executeUpdate();
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		return rowAdded;
	}

	public List<Member> findAll() {
		return null;
	}

	public int remove(int id) {
		return 0;
	}

	public Member findById(int id) {
		return null;
	}

	public int update(int Id, Member member) {
		return 0;
	}
	
	
}
