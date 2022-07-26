package org.zy.pub;

import com.google.protobuf.ByteString;
import io.dapr.v1.DaprGrpc;
import io.dapr.v1.DaprProtos;
import io.grpc.ManagedChannelBuilder;

public class Pub {
    public static void main(String[] args) {
        var channel = ManagedChannelBuilder.forTarget("localhost:65521").usePlaintext().build();
        var stub = DaprGrpc.newBlockingStub(channel);
        var request = DaprProtos
                .PublishEventRequest
                .newBuilder()
                .setPubsubName("default-pubsub")
                .setTopic("a.world")
                .setData(ByteString.copyFromUtf8("Hello world!"))
                .setDataContentType("text/plain")
                .build();
        stub.publishEvent(request);
    }
}