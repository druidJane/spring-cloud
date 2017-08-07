package com.druid.Receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhangz on 2017/8/7.消息消费者
 */
@Component
@RabbitListener(queues = "hello")//队列监听者
public class Receiver {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RabbitHandler
    public void process(String hello){
        log.info("Receiver : " + hello);
    }
}
