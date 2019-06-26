package com.sensin.tcc.clientA.mq.sender;

import com.sensin.tcc.clientA.mq.callback.TestCallBackSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
@Slf4j
public class TestSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private TestCallBackSender callBackSender;

    public void send(String topic, String message) {
        //设置消息确认机制
        rabbitTemplate.setConfirmCallback(callBackSender);
        //准备数据
        CorrelationData correlationData = new CorrelationData(new Date().toLocaleString());
        log.info("消息id:" + correlationData.getId());
        // 用RabbitMQ发送MQTT需将exchange配置为amq.topic
        this.rabbitTemplate.convertAndSend("amq.topic", topic, message, correlationData);
    }
}
