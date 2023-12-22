package com.kafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.service.KafkaProducer;

@RestController

public class EndPoint {

	@Autowired
	private KafkaProducer kafkaProducer;

	Logger log = LoggerFactory.getLogger(EndPoint.class);

	@GetMapping("/mesg")
	public String getMessages(@RequestParam("message") String message)

	{
		kafkaProducer.sendMessage(message);
		
		

		System.out.println("im from producer");

		log.debug("********************message send successfully*****************");

		return "message send successfully";
	}

}
