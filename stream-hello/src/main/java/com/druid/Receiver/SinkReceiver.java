package com.druid.Receiver;

import com.druid.StreamHelloApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Created by zhangz on 2017/8/7.
 */
@EnableBinding(Sink.class)
public class SinkReceiver {
    private static final Logger log = LoggerFactory.getLogger(StreamHelloApplication.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload){
        log.info("Receive : " + payload);
    }

}
