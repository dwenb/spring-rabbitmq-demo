package com.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Start {
    public static void main(String[] args){
        ApplicationContext context =
                new GenericXmlApplicationContext("classpath:/rabbit-context.xml");
        AmqpTemplate template = context.getBean(AmqpTemplate.class);
        template.convertAndSend("myQueue", "foo");
        String foo = (String) template.receiveAndConvert("myQueue");

        System.out.println(foo);
    }
}
