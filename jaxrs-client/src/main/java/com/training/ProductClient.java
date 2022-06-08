package com.training;

import com.training.entity.Product;

import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.*;

public class ProductClient {

	public static void main(String[] args) {
/////////////////////////////////////GETALL///////////////////////////////////////	
		/*	
		Client client =ClientBuilder.newClient();
		
		WebTarget target=client.target("http://localhost:8080/product");
		
		Invocation.Builder builder=target.request(MediaType.APPLICATION_JSON);
		
		Response resp=builder.get();
		//	System.out.println(resp);
		String object =resp.readEntity(String.class);
		
		System.out.println(object); */


////////////////////////////////////FINDBYID//////////////////////////////////	


		
		/*Client client =ClientBuilder.newClient();
		
		WebTarget target=client.target("http://localhost:8080/product/789");
		
		Invocation.Builder builder=target.request(MediaType.APPLICATION_JSON);
		
		Response resp=builder.get();
		//	System.out.println(resp);
		String object =resp.readEntity(String.class);
		
		System.out.println(object); */



///////////////////////////////////////POST//////////////////////////////////	
		
		/*Product toAdd=new Product(789,"key",600);
		Response response=builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
		System.out.println(response.getStatus());
		System.out.println(response.readEntity(String.class));
		*/

///////////////////////////////////////////////////////////////////////////////////////		

		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/products");
		Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
		Response resp = builder.get();
//		ProductClient object = resp.readEntity(ProductClient.class);
//		System.out.println(object);
//		System.out.println(resp);
		
		 
		int ch=2;
		if(ch==1) {
			String object=resp.readEntity(String.class);
			System.out.println(object);
		}
		
		if(ch==2) {
			WebTarget target1= target.path("/789");
			Invocation.Builder builder1=target1.request(MediaType.APPLICATION_JSON);
			Response resp1=builder1.get();
			Product object=resp1.readEntity(Product.class);
			System.out.println(object);	
		}
		
		if(ch==3) {
			Product toAdd=new Product(789,"key",600);
			Response response=builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
			System.out.println(response.getStatus());
			System.out.println(response.readEntity(String.class));
		}
		
	}

}
