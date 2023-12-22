package com.kafka.service;

import org.slf4j.*;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	public static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

	private KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {

		this.kafkaTemplate = kafkaTemplate;

	}

	public void sendMessage(String msg) {
		kafkaTemplate.send("topic_demo", msg);
	}

}
