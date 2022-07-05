package com.training.services;

public class CreditCardService  {
	public static int maxCount=4;
	int i=0;
	
  CreditCard [] cards=new CreditCard[maxCount];
	
	public boolean addCard(CreditCard card) {
		
		boolean result=false;
		if(i<maxCount && card!=null ) {
			cards[i]=card;
			System.out.println(i);
			i++;
			result=true;
		}
		return result;
	}
	
	public CreditCard[] getCard() {
		
		return cards;
	}

	public CreditCardService() {
		super();
		
	}
	
	
}

