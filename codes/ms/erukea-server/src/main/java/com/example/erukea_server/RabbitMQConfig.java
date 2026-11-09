package com.example.erukea_server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rabbitmq.client.AMQP.Queue;

@Configuration
public class RabbitMQConfig {

    public static final String QUEUE = "userQueue";

    @Bean
    public Queue userQueue() {
        return new Queue();
    }
}