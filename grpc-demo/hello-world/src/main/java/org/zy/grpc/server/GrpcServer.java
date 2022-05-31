package org.zy.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.zy.grpc.service.GreeterService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Slf4j
public class GrpcServer {

    private static final int PORT = 50051;
    private Server server;


    private void start() throws IOException {
        server = ServerBuilder.forPort(PORT)
                .addService(new GreeterService())
                .build()
                .start();
        log.info("Server started, listening on " + PORT);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("*** shutting down gRPC server since JVM is shutting down");
            try {
                GrpcServer.this.stop();
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
            System.err.println("*** Server shut down");
        }));
    }


    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        var server = new GrpcServer();
        server.start();
        server.blockUntilShutdown();
    }

}
