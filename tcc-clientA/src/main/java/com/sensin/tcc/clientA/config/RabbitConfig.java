package com.sensin.tcc.clientA.config;

import com.sensin.tcc.clientA.constant.RabbitConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Configuration
@Slf4j
public class RabbitConfig {

    @Value("${spring.rabbitmq.addresses}")
    private String addresses;

    @Value("${spring.rabbitmq.username}")
    private String username;

    @Value("${spring.rabbitmq.password}")
    private String password;

    @Value("${spring.rabbitmq.publisher-confirms}")
    private boolean publisherConfirms;


    @Bean
    TopicExchange exchange() {
        return (TopicExchange) ExchangeBuilder.topicExchange(RabbitConstant.EXCHANGE_NAME).durable(true).build();
    }

    @Bean
    public Queue queue() {
        return QueueBuilder.durable(RabbitConstant.QUEUE_NAME).build();
    }

    @Bean
    public Binding binding() {
        return BindingBuilder.bind(queue()).to(exchange()).with(RabbitConstant.ROUTING_KEY);
    }

    @Bean
    public ConnectionFactory connectionFactory() {

        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setAddresses(addresses);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        /** 如果要进行消息回调，则这里必须要设置为true */
        connectionFactory.setPublisherConfirms(publisherConfirms);
        return connectionFactory;
    }


    /**
     * 因为要设置回调类，所以应是prototype类型，如果是singleton类型，则回调类为最后一次设置
     */
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        template.setMandatory(true);
        return template;
    }

    @Bean
    public SimpleMessageListenerContainer messageContainer() {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory());
        container.setQueues(queue());
        container.setExposeListenerChannel(true);
        container.setMaxConcurrentConsumers(1);
        container.setConcurrentConsumers(1);
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL);
        container.setMessageListener(new ChannelAwareMessageListener() {
            @Override
            public void onMessage(Message message, com.rabbitmq.client.Channel channel) throws Exception {
                try {
                    log.info("消费端接收到消息:" + message.getBody().toString());
                    // false只确认当前一个消息收到，true确认所有consumer获得的消息
                    channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);

                } catch (Exception e) {
                    e.printStackTrace();
                    if (message.getMessageProperties().getRedelivered()) {
                        log.info("消息已重复处理失败,拒绝再次接收...");
                        // 拒绝消息
                        channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);
                    } else {
                        log.info("消息即将再次返回队列处理...");
                        // requeue为是否重新回到队列
                        channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);
                    }
                }
            }
        });
        return container;
    }

}
