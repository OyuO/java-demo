package org.zy.response;

import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);
        ServerBuilder
                .forPort(7001)
                .addService(new HelloServiceImpl())
                .build()
                .start();
        System.out.println("grpc server start!");
    }
}
