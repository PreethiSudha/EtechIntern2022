package com.training.services;

public class CreditCard {

	private long cardNumber;
	private String cardHolderName;
	private double amountDue;
	
	public CreditCard() {
		super();
	}

	public CreditCard(long cardNumber, String cardHolderName, double amountDue) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.amountDue = amountDue;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public double getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
	
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", amountDue="
				+ amountDue + "]";
	}
	
}
