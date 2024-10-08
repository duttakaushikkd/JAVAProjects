package com.example.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.example.demo.constants.AppConstant;

@Configuration
public class KafkaConfig {
	
	@Bean
	public NewTopic topic() {
		
		return TopicBuilder
				.name(AppConstant.LOCATION_TOPIC_NAME )
				.build();
		
	}

}
