package org.zy.demo.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqttConfiguration {

    private static final String HOST = "tcp://localhost:1883";

    private static final String USERNAME = "admin";

    private static final String PASSWORD = "123456";

    private static final String CLIENT_ID = "client-sdk";

    private static final String[] SUB_TOPICS = {"sub"};


    @Bean
    public MqttClient mqttClient() {
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
            return client;
        } catch (MqttException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
