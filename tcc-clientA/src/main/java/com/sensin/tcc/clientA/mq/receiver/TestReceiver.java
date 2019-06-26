package com.sensin.tcc.clientA.mq.receiver;


import com.sensin.model.message.command.SendMessageCommand;
import com.sensin.tcc.clientA.constant.RabbitConstant;
import com.sensin.util.json.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitConstant.QUEUE_NAME)
@Slf4j
public class TestReceiver {
    @RabbitHandler
    public void process(String sendMessageCommandJson) {
        try {
            log.info("接收到: " + sendMessageCommandJson);
        } catch (Exception e) {
            log.error("接收异常: " + e.getMessage() + " 参数: " + sendMessageCommandJson);
        }
    }
}
