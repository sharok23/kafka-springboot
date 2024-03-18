package com.edstem.App.controller;

import com.edstem.App.kafka.NewKafkaProducer;
import com.edstem.App.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
@RequiredArgsConstructor
public class NewJsonMessageController {
    private final NewKafkaProducer producer;


    public String publish(@RequestBody User user){
        producer.sentMessage(user);
        return "Message sent";
    }
}
