package org.zy.pub;

import com.google.protobuf.ByteString;
import io.dapr.v1.DaprGrpc;
import io.dapr.v1.DaprProtos;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

public class Pub {
    public static void main(String[] args) throws InterruptedException {
        var channel = ManagedChannelBuilder.forTarget("localhost:3503").usePlaintext().build();
        var stub = DaprGrpc.newBlockingStub(channel);
        var request = DaprProtos
                .PublishEventRequest
                .newBuilder()
                .setPubsubName("pubsub")
                .setTopic("hello")
                .setData(ByteString.copyFromUtf8("Hello world!"))
                .setDataContentType("json")
                .putMetadata("rawPayload", "true")
                .build();
        while (true) {
            try {
                stub.publishEvent(request);
            } catch (Exception e) {

            }
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
