package com.training;

import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.*;

public class ProductClient {

	public static void main(String[] args) {
		
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/products");
		Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
		Response resp = builder.get();
//		ProductClient object = resp.readEntity(ProductClient.class);
//		System.out.println(object);
		
	}

}
