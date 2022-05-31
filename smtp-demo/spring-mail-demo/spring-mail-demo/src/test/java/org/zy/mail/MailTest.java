//package org.zy.mail;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//
//import javax.annotation.Resource;
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//import java.io.File;
//
//@SpringBootTest
//class MailTest {
//
//    @Resource
//    private JavaMailSender javaMailSender;
//
//    @Value("${spring.mail.username}")
//    private String from;
//
//    @Test
//    void send() {
//        var message = new SimpleMailMessage();
//        message.setFrom(from);
//        message.setTo("jie.yao@qihaixing.com", "sizhou.long@qihaixing.com", "yu.zhang@qihaixing.com");
//        message.setSubject("Subject");
//        message.setText("Hello world!");
//        javaMailSender.send(message);
//    }
//
//    @Test
//    void sendWithAttachment() throws MessagingException {
//        var mimeMessage = javaMailSender.createMimeMessage();
//        var helper = new MimeMessageHelper(mimeMessage, true);
//        helper.setFrom(from);
//        helper.setTo(new String[]{"jie.yao@qihaixing.com", "sizhou.long@qihaixing.com", "yu.zhang@qihaixing.com"});
//        helper.setSubject("邮件发送测试");
//        helper.setText("邮件发送测试");
//        var file = new File("C:\\Users\\Pike\\Desktop\\路飞.webp");
//        helper.addAttachment(file.getName(), file);
//        javaMailSender.send(mimeMessage);
//    }
//
//}
