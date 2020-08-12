package com.example.spring.producer.service;

import com.example.spring.producer.dto.Message;
import org.springframework.stereotype.Component;

public interface AmqpService {
    void sendToConsumer(Message message);
}
