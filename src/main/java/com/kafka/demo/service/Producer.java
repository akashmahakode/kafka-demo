package com.kafka.demo.service;

import com.kafka.demo.api.domain.User;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private KafkaTemplate<String, User> kafkaTemplate;

    private static final String TOPIC = "Kafka-Demo";

    public Producer(KafkaTemplate template){
        this.kafkaTemplate = template;
    }

    public void publish(User user) {
        kafkaTemplate.send(TOPIC, user);
    }
}
