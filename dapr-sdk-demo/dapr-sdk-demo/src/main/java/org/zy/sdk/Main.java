package org.zy.sdk;

import io.dapr.client.DaprClientBuilder;

public class Main {
    public static void main(String[] args) {
        var daprClient = new DaprClientBuilder().build();
        daprClient.publishEvent("pubsub", "weve.test", "hello world");
    }
}
