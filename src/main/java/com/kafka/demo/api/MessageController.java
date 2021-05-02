package com.kafka.demo.api;

import com.kafka.demo.api.domain.User;
import com.kafka.demo.service.Producer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/kafka-demo", "/kafka-demo/"})
public class MessageController {

    private Producer producer;

    public MessageController(Producer producer){
        this.producer = producer;
    }

    @PostMapping(value = {"/publish","/publish/"})
    public String sendMessage(@RequestBody User user){
        producer.publish(user);
        return "Published Successfully";
    }
}
