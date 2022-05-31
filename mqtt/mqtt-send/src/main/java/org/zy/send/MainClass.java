package org.zy.send;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.util.UUID;
import java.util.concurrent.CountDownLatch;

public class MainClass {
    private static final String HOST = "tcp://localhost:1883";

    private static final String USERNAME = "admin";

    private static final String PASSWORD = "123456";

    private static final String CLIENT_ID = "client-send";

    private static final String[] SUB_TOPICS = {"sub"};

    public static void main(String[] args) throws MqttException, InterruptedException {
        var client = new MqttClient(HOST, CLIENT_ID, new MemoryPersistence());
        var options = new MqttConnectOptions();
        options.setCleanSession(true);
        options.setUserName(USERNAME);
        options.setPassword(PASSWORD.toCharArray());
        options.setAutomaticReconnect(true);
        options.setMaxReconnectDelay(2000);
        options.setConnectionTimeout(10);
        options.setKeepAliveInterval(20);
        options.setMaxInflight(5000);
        client.connect(options);

        var latch = new CountDownLatch(1);
        for (int i = 0; i < 5; i++) {
            new Worker(client, new byte[16 * 1024]).start();
        }

        latch.await();


    }


    private static class Worker extends Thread {

        private final MqttClient client;

        private final byte[] bytes;

        public Worker(MqttClient client, byte[] bytes) {
            this.client = client;
            this.bytes = bytes;
        }

        @Override
        public void run() {
            while (true) {
                var topic = client.getTopic("sub");
                var message = new MqttMessage();
                message.setQos(1);
                message.setRetained(false);
                message.setPayload(bytes);
                try {
                    topic.publish(message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
