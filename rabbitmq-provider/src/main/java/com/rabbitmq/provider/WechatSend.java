package com.rabbitmq.provider;

import com.guohai.entity.WechatMessage;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dwenb
 * @date 2019-03-12 16:36
 */
@Component
public class WechatSend {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    /**
     * exchange test-topic下的topic.ding、topic.*、topic.#队列可收到消息，
     * 如topic.ddd、topic.ding.wwww等则不会收到
     *
     * @param wechatMessage
     */
    public void sendTopic(WechatMessage wechatMessage) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(wechatMessage.getId());
        rabbitTemplate.convertAndSend("test-topic", "topic.ding", wechatMessage, correlationData);
    }

    /**
     * exchange test-topic下的topic.*、topic.#队列可收到信息，
     * 如topic.ddd、topic.ding.wwww等则不会收到
     *
     * @param wechatMessage
     */
    public void sendTopicAsterisk(WechatMessage wechatMessage) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(wechatMessage.getId());
        rabbitTemplate.convertAndSend("test-topic", "topic.*", wechatMessage, correlationData);
    }

    /**
     * exchange test-topic下的topic.*、topic.#队列可收到信息，
     * 如topic.ddd、topic.ding.wwww等则不会收到
     *
     * @param wechatMessage
     */
    public void sendTopicPoundSign(WechatMessage wechatMessage) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(wechatMessage.getId());
        rabbitTemplate.convertAndSend("test-topic", "topic.#", wechatMessage, correlationData);
    }

    /**
     * 仅exchange test-direct下的direct.ding队列可收到信息，
     *
     * @param wechatMessage
     */
    public void sendDirect(WechatMessage wechatMessage) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(wechatMessage.getId());
        rabbitTemplate.convertAndSend("test-direct", "direct.ding", wechatMessage, correlationData);
    }

    /**
     * 仅echange test-direct下的direct.*队列可收到消息
     *
     * @param wechatMessage
     */
    public void sendDirectAsterisk(WechatMessage wechatMessage) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(wechatMessage.getId());
        rabbitTemplate.convertAndSend("test-direct", "direct.*", wechatMessage, correlationData);
    }

    /**
     * 仅echange test-direct下的direct.*队列可收到消息
     *
     * @param wechatMessage
     */
    public void sendDirectPoundSign(WechatMessage wechatMessage) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(wechatMessage.getId());
        rabbitTemplate.convertAndSend("test-direct", "direct.#", wechatMessage, correlationData);
    }

    /**
     * echange test-fanout下的所有队列都能收到消息
     *
     * @param wechatMessage
     */
    public void sendFanout(WechatMessage wechatMessage) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(wechatMessage.getId());
        rabbitTemplate.convertAndSend("test-fanout", "fanout.ding", wechatMessage, correlationData);
    }

    /**
     * change test-fanout下的所有队列都能收到消息
     *
     * @param wechatMessage
     */
    public void sendFanoutAsterisk(WechatMessage wechatMessage) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(wechatMessage.getId());
        rabbitTemplate.convertAndSend("test-fanout", "fanout.*", wechatMessage, correlationData);
    }

    /**
     * change test-fanout下的所有队列都能收到消息
     *
     * @param wechatMessage
     */
    public void sendFanoutPoundSign(WechatMessage wechatMessage) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(wechatMessage.getId());
        rabbitTemplate.convertAndSend("test-fanout", "fanout.#", wechatMessage, correlationData);
    }

    /**
     * change test-headers下的所有队列都能收到消息
     *
     * @param wechatMessage
     */
    public void sendHeaders(WechatMessage wechatMessage) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(wechatMessage.getId());
        rabbitTemplate.convertAndSend("test-headers", "headers.ding", wechatMessage, correlationData);
    }

    /**
     * change test-headers下的所有队列都能收到消息
     *
     * @param wechatMessage
     */
    public void sendHeadersAsterisk(WechatMessage wechatMessage) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(wechatMessage.getId());
        rabbitTemplate.convertAndSend("test-headers", "headers.ding", wechatMessage, correlationData);
    }

    /**
     * change test-headers下的所有队列都能收到消息
     *
     * @param wechatMessage
     */
    public void sendHeadersPoundSign(WechatMessage wechatMessage) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(wechatMessage.getId());
        rabbitTemplate.convertAndSend("test-headers", "headers.ding", wechatMessage, correlationData);
    }

}
