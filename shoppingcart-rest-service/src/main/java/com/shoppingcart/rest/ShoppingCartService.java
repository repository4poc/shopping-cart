package com.shoppingcart.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

 
@Path("/")
public class ShoppingCartService 
{
	
	@GET
	@Produces("application/json")
	public Response getStartingPage()
	{
		String output = "[{ id: 1,name: 'Sofa: Model 121', price: 499.99,currency: 'Rs',image: 'images/01.jpg'},{id: 2,name: 'Sofa: Model 122',price: 249.99, currency: 'Rs', image: 'images/02.jpg'},{id: 3,name: 'Sofa: Model 123',price: 239.99,currency: 'Rs',image: 'images/04.jpg'},{id: 5, name: 'Sofa: Model 124', price: 119.99, currency: 'Rs', image: 'images/06.jpg'}, {id: 5, name: 'Sofa: Model 125',    price: 599.99, currency: 'Rs', image: 'images/05.jpg'},{id: 3,name: 'Sofa: Model 126',price: 149.99,currency: 'Rs',image: 'images/03.jpg'}]";

		return Response.status(200).entity(output).build();
	}
}
