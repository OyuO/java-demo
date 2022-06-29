package org.zy.demo.mqtt;

import com.google.protobuf.InvalidProtocolBufferException;
import com.qhx.proto.event.Event;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class PushCallback implements MqttCallback {


    @Override
    public void connectionLost(Throwable cause) {
        System.out.println("connection lost!");
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {
    }

    @Override
    public void messageArrived(String topic, MqttMessage message) {
        try {
            System.out.println("收到了消息!");
            var event = Event.parseFrom(message.getPayload());
        } catch (InvalidProtocolBufferException e) {
            System.out.println("解析event失败!");
        }
    }

}