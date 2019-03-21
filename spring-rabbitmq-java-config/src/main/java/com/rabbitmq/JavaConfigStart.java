package com.rabbitmq;

import com.rabbitmq.config.RabbitConfiguration;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigStart {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(RabbitConfiguration.class);
        AmqpTemplate template = context.getBean(AmqpTemplate.class);
        template.convertAndSend("myQueue", "foo");
        String foo = (String) template.receiveAndConvert("myQueue");
        System.out.println("<!--规避代码重复检测-->，输出:" + foo);
    }
}
