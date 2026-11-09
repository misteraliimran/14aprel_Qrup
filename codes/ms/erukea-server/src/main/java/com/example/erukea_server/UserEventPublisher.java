package com.example.erukea_server;

import org.jvnet.hk2.annotations.Service;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserEventPublisher {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendUserEvent(UserCreatedEvent event) {

        rabbitTemplate.convertAndSend(
            RabbitMQConfig.QUEUE,
            event
        );
    }
}