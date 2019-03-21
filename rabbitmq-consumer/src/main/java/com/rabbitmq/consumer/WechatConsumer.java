package com.rabbitmq.consumer;

import com.guohai.entity.WechatMessage;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author dwenb
 * @date 2019-03-13 15:37
 */
@Component
public class WechatConsumer {

    /**
     * RabbitListener用binding时，若exchange或queue不存在会创建
     * @param wechatMessage
     * @param headers
     * @param channel
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "myQueue", durable = "true"),
            exchange = @Exchange(value = "test"),
            key = "order.*")
    )
    @RabbitHandler
    public void getInfo(@Payload WechatMessage wechatMessage,
                        @Headers Map<String, Object> headers,
                        Channel channel
                        ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }


    @RabbitListener(queues = "queueDirect")
    @RabbitHandler
    public void getDirect(@Payload WechatMessage wechatMessage,
                        @Headers Map<String, Object> headers,
                        Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueDirect1")
    @RabbitHandler
    public void getDirect1(@Payload WechatMessage wechatMessage,
                          @Headers Map<String, Object> headers,
                          Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueDirect2")
    @RabbitHandler
    public void getDirect2(@Payload WechatMessage wechatMessage,
                          @Headers Map<String, Object> headers,
                          Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueDirectAsterisk")
    @RabbitHandler
    public void getDirectAsterisk(@Payload WechatMessage wechatMessage,
                             @Headers Map<String, Object> headers,
                             Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueDirectPoundSign")
    @RabbitHandler
    public void getDirectPoundSign(@Payload WechatMessage wechatMessage,
                             @Headers Map<String, Object> headers,
                             Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueTopic")
    @RabbitHandler
    public void getTopic(@Payload WechatMessage wechatMessage,
                             @Headers Map<String, Object> headers,
                             Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueTopic1")
    @RabbitHandler
    public void getTopic1(@Payload WechatMessage wechatMessage,
                         @Headers Map<String, Object> headers,
                         Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueTopic2")
    @RabbitHandler
    public void getTopic2(@Payload WechatMessage wechatMessage,
                         @Headers Map<String, Object> headers,
                         Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueTopic3")
    @RabbitHandler
    public void getTopic3(@Payload WechatMessage wechatMessage,
                         @Headers Map<String, Object> headers,
                         Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }


    @RabbitListener(queues = "queueTopicAsterisk")
    @RabbitHandler
    public void getTopicAsterisk(@Payload WechatMessage wechatMessage,
                             @Headers Map<String, Object> headers,
                             Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueTopicPoundSign")
    @RabbitHandler
    public void getTopicPoundSign(@Payload WechatMessage wechatMessage,
                             @Headers Map<String, Object> headers,
                             Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueFanout")
    @RabbitHandler
    public void getFanout(@Payload WechatMessage wechatMessage,
                             @Headers Map<String, Object> headers,
                             Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueFanout1")
    @RabbitHandler
    public void getFanout1(@Payload WechatMessage wechatMessage,
                          @Headers Map<String, Object> headers,
                          Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueFanout2")
    @RabbitHandler
    public void getFanout2(@Payload WechatMessage wechatMessage,
                          @Headers Map<String, Object> headers,
                          Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueFanout3")
    @RabbitHandler
    public void getFanout3(@Payload WechatMessage wechatMessage,
                          @Headers Map<String, Object> headers,
                          Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }


    @RabbitListener(queues = "queueFanoutAsterisk")
    @RabbitHandler
    public void getFanoutAsterisk(@Payload WechatMessage wechatMessage,
                             @Headers Map<String, Object> headers,
                             Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueFanoutPoundSign")
    @RabbitHandler
    public void getFanoutPoundSign(@Payload WechatMessage wechatMessage,
                             @Headers Map<String, Object> headers,
                             Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueHeaders")
    @RabbitHandler
    public void getHeaders(@Payload WechatMessage wechatMessage,
                          @Headers Map<String, Object> headers,
                          Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueHeaders1")
    @RabbitHandler
    public void getHeaders1(@Payload WechatMessage wechatMessage,
                           @Headers Map<String, Object> headers,
                           Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueHeaders2")
    @RabbitHandler
    public void getHeaders2(@Payload WechatMessage wechatMessage,
                           @Headers Map<String, Object> headers,
                           Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueHeadersAsterisk")
    @RabbitHandler
    public void getHeadersAsterisk(@Payload WechatMessage wechatMessage,
                          @Headers Map<String, Object> headers,
                          Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }

    @RabbitListener(queues = "queueHeadersPoundSign")
    @RabbitHandler
    public void getHeadersPoundSign(@Payload WechatMessage wechatMessage,
                          @Headers Map<String, Object> headers,
                          Channel channel
    ) {
        System.out.println(wechatMessage);
        System.out.println(headers);
        System.out.println(channel.getChannelNumber());
    }
}
