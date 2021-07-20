package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		MessageProcessor  userService = applicationContext.getBean(MessageProcessor.class);
		userService.processMsg("SMS message sending ");
	}

}
