package com.example.demo.services;

import java.sql.*;
import java.util.*;
import com.example.entity.*;

public class ProductService {

	private Connection con;

//	public ProductService() {
//		super();
//	}
	
//	it returns null and the progam will get fail

	public ProductService(Connection con) {
		super();
		this.con = con;
	}
	
	public int UpdatePriceByName(String productName, double newPrice) {
		
		int rowsUpdated = 0;
		
		String sql = "Update preetz_product set product_price = ? where product_name = ?";
		
		try(PreparedStatement pstmnt = con.prepareStatement(sql)) {
			
			pstmnt.setDouble(1, newPrice);
			
			pstmnt.setString(2, productName);
			
			rowsUpdated = pstmnt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return rowsUpdated;
	}
	
	public int addProduct(Product product) {
		
		int rowAdded = 0;
		 
		String sql = "insert into preetz_product values(?, ?, ?)";
		 
		try(PreparedStatement pstmnt = con.prepareStatement(sql)) {
				
				pstmnt.setInt(1, product.getProductId());
				pstmnt.setString(2, product.getProductName());
				pstmnt.setDouble(3,  product.getProductPrice());
				
				rowAdded = pstmnt.executeUpdate();
			}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		return rowAdded;
	}
	
	public int deleteById(int Id) {
		
		int rowsDeleted = 0;
		
		String sql = "delete from preetz_product where product_id=?";
		
		try(PreparedStatement pstmnt = con.prepareStatement(sql)) {
			
			pstmnt.setInt(1, Id);
			
			rowsDeleted = pstmnt.executeUpdate();
		}
		catch(SQLException e) 
		{
		e.printStackTrace();
		}
		
		return rowsDeleted;
		
	}
	
	public Optional<Product> findById(int Id){
		
		Optional<Product> obj = Optional.empty();
		
		String sql = "select * from preetz_product where product_id=?";
		
		try(PreparedStatement pstmnt = con.prepareStatement(sql)) {
		
		pstmnt.setInt(1, Id);
			
		ResultSet rs = pstmnt.executeQuery();
		
		if(rs.next()) {
		
		int productId = rs.getInt("product_id");
		String productName = rs.getString("product_name");
		double productPrice = rs.getDouble("product_price");
		
		Product prod = new Product(productId, productName, productPrice);
		
		obj= Optional.of(prod);
		}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return obj;
	}
	
	public List<Product> findAll(){
		
		List<Product> productList = new ArrayList<Product>();
		
		String sql = "select * from preetz_product";
		
		try(PreparedStatement pstmnt = con.prepareStatement(sql)) {
			
			ResultSet res = pstmnt.executeQuery(sql);
			
			while(res.next()) {
				
			int productId = res.getInt("product_id");
			String productName = res.getString("product_name");
			double productPrice = res.getDouble("product_price");
					
			Product prod = new Product(productId, productName, productPrice);
					
			productList.add(prod);
					
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}
	
	//to put in maven jdbc
	public void usingTxn(Product pd1, Invoice iv) {
		
		String addProductSql = "insert into preetz_product values (?,?,?)";
		String addInvoiceSql = "insert into preetz_product values (?,?,?)";
		//int rowAdded = 0;
		
//		try(PreparedStatement pstmnt = con.prepareStatement(str)) {
		
		try(PreparedStatement pstmnt = con.prepareStatement(addProductSql);
				PreparedStatement invcstmnt = con.prepareStatement(addInvoiceSql)) {	
			
			con.setAutoCommit(false);
			
			pstmnt.setInt(1, pd1.getProductId());
			pstmnt.setString(2, pd1.getProductName());
			pstmnt.setDouble(3, pd1.getProductPrice());
			
			int productAddCount = pstmnt.executeUpdate();	
			
			invcstmnt.setInt(1, iv.getInvoiceNumber());
			invcstmnt.setString(2, iv.getCustomerName());
			invcstmnt.setDouble(3, iv.getQuantity());
			invcstmnt.setInt(4, iv.getProductRef());
			
			int invoiceAddCount = invcstmnt.executeUpdate();
			
			con.commit();
			
//			int rowAdded1 = pstmnt.executeUpdate();	
			
//			pstmnt.setInt(1, pd2.getProductId());
//			pstmnt.setString(2, pd2.getProductName());
//			pstmnt.setDouble(3, pd2.getProductPrice());
//			
//			int rowAdded2 = pstmnt.executeUpdate();	
//			
//			if(pd2.getProductPrice()>pd1.getProductPrice()) {
//				con.commit();
//			}else {
//				con.rollback();
//			}
//			
			// for adding only one product
			//con.commit();
			//if we dont use this, our code will get committed and excecuted succesfully 
			//but the code will not save in table
			//by using it only , we can save the data in the table so we use it here 
			
//			System.out.println("RowAdded:=" +rowAdded1);
//			System.out.println("RowAdded:=" +rowAdded2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

