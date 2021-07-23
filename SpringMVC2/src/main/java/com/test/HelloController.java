package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController 
{

	@RequestMapping("/hello")
	public String sayHello()
	{
		return "greet";
	}
	
	@RequestMapping("/helloagain")
	public String sayHelloAgain()
	{
		return "greetagain";
	}
	
	@RequestMapping("/greetuser")
	public String sayHelloUser()
	{
		return "hellouser";
	}
}