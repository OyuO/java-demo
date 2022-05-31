package org.zy.pulsar.simple_test;


import org.apache.pulsar.client.api.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PulsarConsumerTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PulsarConsumerTest.class);

    @Test
    public void consume() throws PulsarClientException {
        var pulsarClient = PulsarClient.builder().serviceUrl(PulsarProducerTest.HOST).authentication(AuthenticationFactory.token("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiJ9.iYYrrbYysQMpyBJXamA_XpVglRVKNXxq7MjotUj7Wfs")).build();
        var consumer = pulsarClient
                .newConsumer(Schema.STRING)
                .topic(PulsarProducerTest.TOPIC)
                .subscriptionName("consumer")
                .subscribe();
        while (true) {
            var message = consumer.receive();
            var value = message.getValue();
            LOGGER.info("消息数据为: {}", value);
            consumer.acknowledge(message);
        }
    }
}
