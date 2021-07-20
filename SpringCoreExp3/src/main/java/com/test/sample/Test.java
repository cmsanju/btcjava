package com.test.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TextSMS obj = ctx.getBean(TextSMS.class);
		
		obj.sayHi("Hello User");
	}

}
