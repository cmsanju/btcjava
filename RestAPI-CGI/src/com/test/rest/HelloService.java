package com.test.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService 
{
	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public String plainTest()
	{
		return "Hello this rest api plain text service";
	}
	
	@GET
	@Path("/html/{name}")
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML(@PathParam("name") String name)
	{
		return"<html><body><h2> Hi this is REST API HTML response  "+name+"</h2></body></html>";
	}
	
	@GET
	@Path("/user")
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTMLForm(@QueryParam("user") String user, @QueryParam("pass") String pass)
	{
		return"<html><body><h2> Hi this is REST API HTML response  "+user+" "+pass+"</h2></body></html>";
	}
}
