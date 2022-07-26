package org.zy.pulsar.simple_test;


import lombok.Data;
import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.impl.schema.AvroSchema;


public class TestProducer {

    @Data
    public static class Foo {
        private int field1 = 1;
        private String field2;
        private long field3;

    }

    public static void main(String[] args) throws Exception {
        PulsarClient pulsarClient = PulsarClient.builder().serviceUrl("pulsar://192.168.30.103:6650").build();
        Producer<Foo> producer = pulsarClient.newProducer(AvroSchema.of(Foo.class)).topic("test_topic").create();

        for (int i = 0; i < 1000; i++) {
            Foo foo = new Foo();
            foo.setField1(i);
            foo.setField2("foo" + i);
            foo.setField3(System.currentTimeMillis());
            producer.newMessage().value(foo).send();
        }
        producer.close();
        pulsarClient.close();
    }
}