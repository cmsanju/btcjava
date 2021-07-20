package com.test.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.test.sample")
public class AppConfig {
	
	public TextSMS textSMS;
	
	@Bean(name = "TestSMS")
	public TextSMS getInstance()
	{
		return this.textSMS = new TextSMS();
	}
	 
}
