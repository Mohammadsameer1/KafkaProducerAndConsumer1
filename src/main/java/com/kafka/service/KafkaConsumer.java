package com.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(	topics = "topic_demo", groupId = "mygroup")
	public void getMessages(String message)

	{
		LOGGER.info(message+"   comming  from consumer ");

		System.out.println("*****************" + message + "***  from consumer***************");
		
	

	}

}
