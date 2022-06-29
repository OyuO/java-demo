package org.zy.sub;

import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        var server = ServerBuilder
                .forPort(6001)
                .addService(new DaprCallbackService())
                .build().start();
        log.info("Sub grpc server start!");
        server.awaitTermination();
    }
}
