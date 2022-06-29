package org.zy.demo.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class Client {

//    private static final String HOST = "tcp://8.140.189.152:13007";

    private static final String HOST = "tcp://192.168.30.104:1883";

    private static final String USERNAME = "qhx";

    private static final String PASSWORD = "qhx";

    private static final String CLIENT_ID = "client-sdk";

    private static final String[] SUB_TOPICS = {"weve/event-operator"};

    public static void main(String[] args) {
        try {
            var client = new MqttClient(HOST, CLIENT_ID, new MemoryPersistence());
            var options = new MqttConnectOptions();
            options.setCleanSession(true);
            options.setUserName(USERNAME);
            options.setPassword(PASSWORD.toCharArray());
            options.setConnectionTimeout(10);
            options.setKeepAliveInterval(20);
            options.setMaxInflight(10000);
            options.setAutomaticReconnect(true);
            options.setMaxReconnectDelay(2000);
            client.connect(options);
            client.setCallback(new PushCallback());
            int[] qos = {1};
            client.subscribe(SUB_TOPICS, qos);
        } catch (MqttException e) {
            System.out.println("Mqtt exception: " + e.getMessage());
        }
    }
}
