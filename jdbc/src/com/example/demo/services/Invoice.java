package com.example.demo.services;

public class Invoice {

	private int invoiceNumber;
	private String customerName;
	private int quantity;
	private int productRef;
	
	public Invoice() {
		super();
	}

	public Invoice(int invoiceNumber, String customerName, int quantity, int productRef) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.customerName = customerName;
		this.quantity = quantity;
		this.productRef = productRef;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProductRef() {
		return productRef;
	}

	public void setProductRef(int productRef) {
		this.productRef = productRef;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", customerName=" + customerName + ", quantity=" + quantity
				+ ", productRef=" + productRef + "]";
	}
	
	
}
