//package org.zy.integration;
//
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.zy.integration.client.MqttTemplate;
//
//@Component
//public class Send implements InitializingBean {
//
//    @Autowired
//    private MqttTemplate.MqttGateWay mqttGateWay;
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        for (int i = 0; i < 20; i++) {
//            new Task(mqttGateWay).start();
//        }
//    }
//
//
//    private static class Task extends Thread {
//
//        private final MqttTemplate.MqttGateWay mqttGateWay;
//
//        private Task(MqttTemplate.MqttGateWay mqttGateWay) {
//            this.mqttGateWay = mqttGateWay;
//        }
//
//        @Override
//        public void run() {
//            while (true) {
//                mqttGateWay.sendToMqtt(new byte[8],"sub");
//            }
//        }
//    }
//}
