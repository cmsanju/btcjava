package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SMSService service = ctx.getBean(SMSService.class);
		
		service.sendMsg("SMS Service");
		
		MessageProcessorImpl mimpl = ctx.getBean(MessageProcessorImpl.class);
		
		mimpl.processMsg("SMS Service with impl class");
		
		
		//MessageProcessorImpl obj = (MessageProcessorImpl)ctx.getBean(SMSService.class); // wrong 
		
	}

}
