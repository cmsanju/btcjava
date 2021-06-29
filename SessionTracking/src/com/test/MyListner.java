package com.test;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class MyListner implements HttpSessionListener {

    
   public static int total = 0, current = 0;
   
   public ServletContext ctx = null;
	
    public void sessionCreated(HttpSessionEvent se)  { 
         
    	total++;
    	current++;
    	
    	ctx = se.getSession().getServletContext();
    	
    	ctx.setAttribute("totalusers", total);
    	ctx.setAttribute("currentusers", current);
    
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	
    	current --;
    	
    	ctx.setAttribute("currentusers", current);
        
    }
	
}
