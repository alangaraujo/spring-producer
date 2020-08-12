package com.example.spring.producer.api;

import com.example.spring.producer.dto.Message;
import com.example.spring.producer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/producer")
public class AmqpApi {

    @Autowired
    private AmqpService amqpService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void sendToConsumer(@RequestBody Message message) {
        amqpService.sendToConsumer(message);
    }
}
