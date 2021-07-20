package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.test")
public class AppConfig {
	
	@Bean(name = "SMSService")
	public MessageService messageProcess()
	{
		return new SMSService();
	}
	@Bean
	public MessageProcessorImpl processorService()
	{
		return new MessageProcessorImpl(messageProcess());
	}

}
