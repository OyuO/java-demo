package org.zy.grpc.server;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class GrpcServer implements InitializingBean {

    @Autowired
    private List<BindableService> services;

    @Value("${grpc.port}")
    private int port;

    private Server server;


    private void start() throws IOException {
        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(port);
        services.forEach(serverBuilder::addService);
        server = serverBuilder
                .build()
                .start();
        log.info("Grpc server started, listening on " + port);
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

    @Override
    public void afterPropertiesSet() throws Exception {
//        this.start();
//        this.blockUntilShutdown();
    }
}
