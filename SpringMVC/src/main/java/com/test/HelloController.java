package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController 
{
	@RequestMapping("/login")
	public String userLogin()
	{
		return "login";
	}
	
	@RequestMapping("/register")
	public String userReg()
	{
		return "reg";
	}
}
