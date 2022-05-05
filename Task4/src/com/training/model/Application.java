package com.training.model;
import com.training.*;

public class Application {

	public static void main(String[] args) {
		
		MobileBill mbl = new MobileBill("Preetz", 96385274l, "Prepaid");
		Address ad1 = new Address(425, "Gandhi Street", "Koyambedu", "Chennai", 603103);
		System.out.println(MobileBill.BRAND);
		System.out.println(mbl.getCustomerName());
		System.out.println(mbl.getMobileNumber());
		System.out.println(mbl.getPlanName());
		System.out.println(ad1.getDoorNo());
		System.out.println(ad1.getStreetName());
		System.out.println(ad1.getPlace());
		System.out.println(ad1.getCity());
		System.out.println(ad1.getpinCode());
		
		
	}

}
