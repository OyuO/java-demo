package org.zy.mail;

import com.qhx.common.mail.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MailClientTest {

    @Autowired
    private MailClient mailClient;

    @Test
    public void send() {
        mailClient.sendSimpleMessage(new String[]{"yu.zhang@qihaixing.com"}, "test", "Hello world!");
    }
}
