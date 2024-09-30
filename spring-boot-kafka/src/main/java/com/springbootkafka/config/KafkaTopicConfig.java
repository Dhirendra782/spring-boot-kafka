package com.springbootkafka.config;

import com.springbootkafka.payload.User;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class KafkaTopicConfig {

    //Reading value this file from application.properties
    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Bean
    public NewTopic javaguidesTopic() {
        return TopicBuilder.name(topicName).build();
    }

    //Reading value this file from application.properties
    @Value("${spring.kafka.topic-json.name}")
    private String  topicJsonName;

    @Bean
    public NewTopic javaguidesJsonTopic() {
        return TopicBuilder.name(topicJsonName).build();
    }

}
