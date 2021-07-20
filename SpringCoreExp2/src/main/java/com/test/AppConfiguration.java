package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.test")
@Import(AppConfiguration2.class)
public class AppConfiguration {

	
	@Bean(name="SMSService")
	public MessageService smsService(){
		return new SMSService();
	}
	
}
