package org.zy.grpc.client;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.zy.grpc.proto.GreeterGrpc;
import org.zy.grpc.proto.HelloReply;
import org.zy.grpc.proto.HelloRequest;

import java.util.concurrent.TimeUnit;


@Slf4j
public class GrpcClient {

    private static final String HOST = "localhost:50051";

    private final GreeterGrpc.GreeterBlockingStub blockingStub;

    public GrpcClient(Channel channel) {
        this.blockingStub = GreeterGrpc.newBlockingStub(channel);
    }


    public void greet(String name) {
        log.info("Will try to greet {} ...", name);
        var request = HelloRequest.newBuilder().setName(name).build();
        HelloReply response;
        try {
            response = blockingStub.sayHello(request);
        } catch (StatusRuntimeException e) {
            log.warn("grpc error",e);
            return;
        }

        log.info("Received message: " + response.getMessage());
    }

    public static void main(String[] args) throws InterruptedException {
        var channel = ManagedChannelBuilder.forTarget(HOST).usePlaintext().build();
        try {
            var client = new GrpcClient(channel);
            client.greet("张三");
        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
