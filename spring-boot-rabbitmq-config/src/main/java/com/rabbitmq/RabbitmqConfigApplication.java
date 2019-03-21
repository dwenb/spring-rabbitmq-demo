package com.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitmqConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqConfigApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner(AmqpTemplate template) {
        return args -> template.convertAndSend("myQueue", "foo");
    }

    @Bean
    public Queue myQueue() {
        return new Queue("myQueue");
    }

    @RabbitListener(queues = "myQueue")
    public void listen(String in) {
        System.out.println(in);
    }
}

