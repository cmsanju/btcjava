package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "greet.jsp";
	}
	
	@RequestMapping("/nextpage")
	public String sayAgain()
	{
		return "greet1.jsp";
	}

	@RequestMapping("/lastgreet")
	public String sayLast()
	{
		return "index.jsp";
	}
}
