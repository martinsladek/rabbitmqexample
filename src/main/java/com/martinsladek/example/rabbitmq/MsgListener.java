package com.martinsladek.example.rabbitmq;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MsgListener {
    private final MessageService service;

    @RabbitListener(queues = RabbitConfig.QUEUE)
    public void listen(String msg) {
        System.out.println("Received: " + msg);
        service.process(msg);
    }
}
