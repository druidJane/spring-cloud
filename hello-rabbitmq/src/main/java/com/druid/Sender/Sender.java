package com.druid.Sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by zhangz on 2017/8/7. 消息生产者
 */
@Component
public class Sender {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String context = "hello " + new Date();
        log.info("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello",context);
    }
}
