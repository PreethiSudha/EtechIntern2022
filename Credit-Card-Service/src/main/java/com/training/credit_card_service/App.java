package com.training.credit_card_service;

import com.training.services.CreditCard;
import com.training.services.CreditCardService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	CreditCard card =new CreditCard(23432432L, "Preetz", 5000);
        CreditCardService service= new CreditCardService();
        CreditCard card1 =new CreditCard(234L, "Preethi", 7000);
        CreditCard card2 =new CreditCard(234324, "Haha", 8000);
        service.addCard(card);
        service.addCard(card1);
        service.addCard(card2);
        
        double total=0;
        for(CreditCard eachvalue: service.getCard()) {
     	   
     	   if(eachvalue!=null) {
     		   total+=eachvalue.getAmountDue();
     		   System.out.println(eachvalue);
     	   }
     	   
        }
        
        System.out.println("Total:="+total);
     }
}
