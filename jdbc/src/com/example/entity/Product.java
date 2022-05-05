package com.example.entity;

public class Product {
 
	private int ProductId;
	private String productName;
	private double productPrice;
	
	public Product() {
		super();
	}

	public Product(int productId, String productName, double productPrice) {
		super();
		ProductId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", productName=" + productName + ", "
				+ "productPrice=" + productPrice+ "]";
	}
	
	
 
}
