package com.sensin.tcc.clientA;

import com.sensin.tcc.clientA.mq.sender.TestSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitConfirmTest {


    @Autowired
    private TestSender sender;

    @Test
    public void test() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(1000);
            sender.send("topic.baqgl.admin.1", "测试消息");
        }
        Thread.sleep(1000000000);
    }

}
