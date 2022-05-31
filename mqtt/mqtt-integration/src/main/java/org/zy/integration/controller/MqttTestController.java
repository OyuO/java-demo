package org.zy.integration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.zy.integration.client.MqttTemplate;

import java.io.IOException;

@RestController
public class MqttTestController {

    @Autowired
    private MqttTemplate.MqttGateWay mqttGateWay;

    @RequestMapping("/pub")
    public String pub(MultipartFile file) throws IOException {
        mqttGateWay.sendToMqtt(file.getBytes(), "pub");
        return "SUCCESS";
    }

}
