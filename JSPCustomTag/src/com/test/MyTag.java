package com.test;

import java.util.Date;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport
{
  public int doStartTag()
  {
	 JspWriter out = null;
	 
	 try
	 {
		 out = pageContext.getOut();
		 
		 Date date = new Date();
		 
		 out.println("Current Date Time : "+date);
		 
		 out.println("<br> this is custom tag example");
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	  
	  
	  return SKIP_BODY;
  }
}
