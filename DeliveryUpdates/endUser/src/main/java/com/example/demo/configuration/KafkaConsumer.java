package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.example.demo.constant.AppConstant;

@Configuration
public class KafkaConsumer {
	
	@KafkaListener(topics=AppConstant.LOCATION_UPDATE_TOPIC, groupId=AppConstant.GROUP_ID)
	public void updatedLocation(String value)
	{
		System.out.println(value);
	}

}
