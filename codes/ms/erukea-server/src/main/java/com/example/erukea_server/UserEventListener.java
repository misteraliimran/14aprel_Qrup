package com.example.erukea_server;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class UserEventListener {

    @RabbitListener(queues = "userQueue")
    public void receiveEvent(UserCreatedEvent event) {

        System.out.println(
            "Yeni istifadəçi yaradıldı: "
            + event.getUsername()
        );
    }
}