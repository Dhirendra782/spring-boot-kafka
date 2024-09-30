package com.springbootkafka.kafka;

import com.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsoKafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(JsoKafkaConsumer.class);


    //This is reading from value application.properties ${spring.kafka.topic-json.name}
    @KafkaListener(topics = "${spring.kafka.topic-json.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(User user) {
        logger.info(String.format("Json message recieved -> %s", user.toString()));

    }

}









