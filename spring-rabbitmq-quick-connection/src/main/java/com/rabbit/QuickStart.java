package com.rabbit;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class QuickStart {
    public static void main(String[] args) {
        //官方文档第一个CachingConnectionFactory用的是ConnectionFactory，且没有连hostname和用户名密码，经测试需要填写
        //CachingConnectionFactory构造函数添加hostname后默认增加端口5672
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost");
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");

        AmqpAdmin amqpAdmin = new RabbitAdmin(connectionFactory);
        amqpAdmin.declareQueue(new Queue("myQueue"));

        AmqpTemplate amqpTemplate = new RabbitTemplate(connectionFactory);
        amqpTemplate.convertAndSend("myQueue", "foo");

        String foo = (String) amqpTemplate.receiveAndConvert("myQueue");

        System.out.println(foo);
    }
}
