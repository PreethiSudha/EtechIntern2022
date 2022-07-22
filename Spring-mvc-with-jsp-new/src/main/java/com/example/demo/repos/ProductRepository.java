package com.example.demo.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.CrudRepository;

@Repository
public class ProductRepository implements CrudRepository<Product> {
	
	private JdbcTemplate template;
	
    @Autowired
	public ProductRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int add(Product t) {
		String sql="insert into preetz_product values(?,?,?)";
		return template.update(sql,t.getProductId(),t.getProductName(),t.getPrice());	
	}

	@Override
	public List<Product> findAll() {
	  String sql="select * from preetz_product";
	  return template.query(sql,
			BeanPropertyRowMapper.newInstance(Product.class));		  
	}
	
	@Override
	public Product findById(int id)
	{ 
		String sql="select * from preetz_product where product_Id=?";
		return template.queryForObject(sql,
			BeanPropertyRowMapper.newInstance(Product.class),id);
	}
	
	@Override
	public int update(Product entity) 
	{
		String sql="Update preetz_product Set product_Name=?, product_Price=? where product_Id=?";
		return template.update(sql,
	         entity.getProductName(),entity.getPrice(),entity.getProductId());
	 }
	
	@Override
	public int delete(int id)
	{
		String sql="Delete from preetz_product where product_Id=?";
		return template.update(sql,id);
	}

}
