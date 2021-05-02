package com.kafka.demo.service;

import com.kafka.demo.api.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@EnableKafka
public class Consumer {

    @KafkaListener(topics = {"Kafka-Demo"}, groupId = "group_id")
    public void consume(User user){
        log.info("Consumed : {}", user);
    }
}
