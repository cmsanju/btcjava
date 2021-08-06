package com.test;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class MyListener implements HttpSessionListener {

	static int current = 0 , total = 0;
	
	ServletContext ctx = null;
    
    public void sessionCreated(HttpSessionEvent se)  { 
        
    	current ++;
    	total ++;
    	
    	ctx = se.getSession().getServletContext();
    	
    	ctx.setAttribute("totaluser", total);
    	ctx.setAttribute("currentuser", current);
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	
    	current --;
    	
    	ctx.setAttribute("currentuser", current);
       
    }
	
}
