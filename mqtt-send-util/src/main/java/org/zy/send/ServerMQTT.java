package org.zy.send;


import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

/**
 * Title:Server 这是发送消息的服务端
 * Description: 服务器向多个客户端推送主题，即不同客户端可向服务器订阅相同主题
 *
 * @author Unclue_liu
 */
public class ServerMQTT {

    /**
     * host
     */
    public static final String HOST = "tcp://192.168.1.105:1883";

    /**
     * clientId
     */
    private static final String CLIENTID = "server";

    private static final String USERNAME = "admin";

    private static final String PASSWORD = "123456";

    private final MqttClient client;

    private MqttTopic defaultTopic;


    /**
     * 构造函数
     *
     * @throws MqttException
     */
    public ServerMQTT() throws MqttException {
        // MemoryPersistence设置clientid的保存形式，默认为以内存保存
        client = new MqttClient(HOST, CLIENTID, new MemoryPersistence());
        connect();
    }

    /**
     * 用来连接服务器
     */
    private void connect() {
        MqttConnectOptions options = new MqttConnectOptions();
        options.setCleanSession(false);
        options.setUserName(USERNAME);
        options.setPassword(PASSWORD.toCharArray());
        // 设置超时时间
        options.setConnectionTimeout(10);
        // 设置会话心跳时间
        options.setKeepAliveInterval(20);
        try {
            client.setCallback(new PushCallback());
            client.connect(options);
            defaultTopic = client.getTopic("test");
            int[] qos = {1};
            String[] subTopics = {"sub"};
            client.subscribe(subTopics, qos);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void publish(MqttTopic topic, MqttMessage message) throws Exception {
        MqttDeliveryToken token = topic.publish(message);
        token.waitForCompletion();
    }


    public void publishWithDefaultTopic(byte[] msg) throws Exception {

        MqttMessage message = new MqttMessage();
        //保证消息能到达一次
        message.setQos(1);
        message.setRetained(false);
        message.setPayload(msg);
        publish(defaultTopic, message);
    }

    public void publishWithTopic(String topic, byte[] msg) throws Exception {
        MqttTopic mqttTopic = client.getTopic(topic);
        MqttMessage message = new MqttMessage();
        //保证消息能到达一次
        message.setQos(1);
        message.setRetained(false);
        message.setPayload(msg);
        publish(mqttTopic, message);
    }

}