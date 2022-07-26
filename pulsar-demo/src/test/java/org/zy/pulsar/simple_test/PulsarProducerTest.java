package org.zy.pulsar.simple_test;

import org.apache.pulsar.client.api.AuthenticationFactory;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.client.api.Schema;
import org.junit.Test;

public class PulsarProducerTest {

//    public static final String TOPIC = "persistent://my_tenant/my_namespace/my_topic2";

    public static final String HOST = "pulsar://192.168.30.103:6650";


    public static final String TOPIC = "test_topic";

    @Test
    public void produce() throws PulsarClientException {
        var pulsarClient = PulsarClient.builder().serviceUrl(HOST).build();
        var producer = pulsarClient.newProducer(Schema.STRING).topic(TOPIC).create();
        producer.send("hello java API pulsar");
        producer.close();
    }
}
