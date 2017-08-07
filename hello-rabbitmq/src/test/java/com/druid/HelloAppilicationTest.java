package com.druid;

import com.druid.Sender.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhangz on 2017/8/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HelloRabbitmqApplication.class)
public class HelloAppilicationTest {
    @Autowired
    private Sender sender;

    @Test
    public void hello()throws Exception{
        for(int i = 0;i<100;i++){
            sender.send();
        }
    }

}
