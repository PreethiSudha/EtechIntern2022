package com.training;

import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.*;

public class ProductClient {

	public static void main(String[] args) {
		
		char ch;
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/products");
		Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
		Response resp = builder.get();
//		ProductClient object = resp.readEntity(ProductClient.class);
//		System.out.println(object);
		
		
		if(ch==2) {
			WebTarget findByIdTarget = target.path("/srch/101");
			Invocation.Builder builder2 = findByIdTarget.request(MediaType.APPLICATION_JSON);
			System.out.println(object2);
			
		}
		if(ch==3) {
			Product toAdd = new Product(528, "ups", 466);
			Response response = builder.post(Entity.entity(toAdd,MediaType.APPLICATION_JSON));
			System.out.println(object3);
			
		}
	}

}
