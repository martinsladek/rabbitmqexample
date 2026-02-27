package com.martinsladek.example.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MsgListener {

    @RabbitListener(queues = RabbitConfig.QUEUE)
    public void listen(String msg) {
        System.out.println("Received: " + msg);
    }
}
