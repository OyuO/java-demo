//package org.zy.integration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//import org.zy.integration.client.MqttTemplate;
//
//@Component
//public class ScheduleTask {
//
//    @Autowired
//    private MqttTemplate.MqttGateWay mqttGateWay;
//
//    private byte[] bytes = new byte[128];
//
//    @Scheduled(fixedDelay = 1)
//    public void send() {
//        while (true) {
//            mqttGateWay.sendToMqtt(bytes, "sub");
//        }
//    }
//}
