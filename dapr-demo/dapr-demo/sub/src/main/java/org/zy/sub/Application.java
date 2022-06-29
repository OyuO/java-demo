package org.zy.sub;


import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@Slf4j
@SpringBootApplication
public class Application {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);
        ServerBuilder
                .forPort(6001)
                .addService(new DaprCallBackService())
                .build()
                .start();
        log.info("grpc server start!");
    }
}
