package org.zy.demo.controller;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
public class TestController {

    @Autowired
    private MqttClient client;

    @RequestMapping("/pub")
    public String pub(MultipartFile file) throws MqttException, IOException {
        var pubTopic = client.getTopic("pub");
        var message = new MqttMessage();
        message.setQos(1);
        message.setRetained(true);
        message.setPayload(file.getBytes());
        pubTopic.publish(message);
        return "SUCCESS";
    }
}
