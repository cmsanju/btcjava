package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/register")
	public 	String userRegister()
	{
		return "register.jsp";
	}
	
	@RequestMapping("/login")
	public String userLogin()
	{
		return "login.jsp";
	}
}
