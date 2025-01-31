package org.zy.smtp;


import org.junit.Test;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SmtpTest {

    @Test
    public void sendEmail() {
        // 收件人电子邮箱
        String to = "jie.yao@qihaixing.com";

        // 发件人电子邮箱
        String from = "service@qihaixing";

        // 指定发送邮件的主机为 smtp.qq.com
        String host = "smtp.feishu.cn";  //QQ 邮件服务器

        // 获取系统属性
        Properties properties = System.getProperties();

        // 设置邮件服务器
        properties.setProperty("mail.smtp.host", host);

        properties.put("mail.smtp.auth", "true");
        // 获取默认session对象
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("service@qihaixing.com", "IJdhBdyQGM1dgy24"); //发件人邮件用户名、授权码
            }
        });

        try {
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(from));

            // Set To: 头部头字段
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: 头部头字段
            message.setSubject("Email test");

            // 设置消息体
            message.setText("Hello 姚杰!");

            // 发送消息
            Transport.send(message);
            System.out.println("邮件发送成功!");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

}
