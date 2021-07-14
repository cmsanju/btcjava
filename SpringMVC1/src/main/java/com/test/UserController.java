package com.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/register")
	public 	String userRegister()
	{
		return "register";
	}
	
	@RequestMapping("/login")
	public String userLogin(Model model, User user)
	{
		model.addAttribute("user", user);
		
		
		
		return "login";
	}
	
	@RequestMapping("/details")
	public String userDetails(Model model, User user)
	{
		model.addAttribute("user", user);
		
		return "userDetails";
	}
	
	@RequestMapping("/regDetails")
	public String regUserDetails(HttpServletRequest request, Model model)
	{
		User u = new User();
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		
		u.setId(Integer.parseInt(id));
		
		u.setName(name);
		u.setCity(city);
		
		model.addAttribute("user", u);
		
		return "regdetails";
	}
	
}
