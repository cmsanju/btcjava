package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageProcessorImpl implements MessageProcessor
{
	public MessageService messageService;
	
	@Autowired
	public MessageProcessorImpl(@Qualifier("SMSService")MessageService messageService)
	{
		this.messageService = messageService;
	}

	public void processMsg(String msg) {
		messageService.sendMsg(msg);
		
	}
	
	
}
