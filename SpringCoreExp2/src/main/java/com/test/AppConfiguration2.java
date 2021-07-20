package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfiguration2 {
	
	@Bean(name="SMSService")
	public MessageService smsServie(){
		return new SMSService();
	}
		
	@Bean
	public MessageProcessor messageProcessor(){
		return new MessageProcessorImpl(smsServie());
	}
}
