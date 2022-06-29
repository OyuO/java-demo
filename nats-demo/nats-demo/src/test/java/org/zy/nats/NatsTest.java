package org.zy.nats;

import io.nats.client.Connection;
import io.nats.client.Nats;
import io.nats.client.Options;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class NatsTest {

    private Connection nc;


    @Before
    public void connect() throws IOException, InterruptedException {
        var options = new Options.Builder().server("nats://192.168.30.103:4222").userInfo("qihaixing", "qihaixing").build();
        nc = Nats.connect(options);
    }


    @Test
    public void blockSub() throws InterruptedException {
        var sub = nc.subscribe("hello", "world");
        var message = sub.nextMessage(Duration.ofSeconds(500));
        System.out.println(new String(message.getData(), StandardCharsets.UTF_8));
    }

    @Test
    public void nonBlockSub() throws InterruptedException {
        var dispatcher = nc.createDispatcher((msg) -> {
            System.out.println(new String(msg.getData(), StandardCharsets.UTF_8));
        });
        dispatcher.subscribe("foo");
        TimeUnit.SECONDS.sleep(1000000000);
    }

    @Test
    public void pub() throws IOException, InterruptedException {
        while (true) {
            nc.publish("test", "姚杰".getBytes(StandardCharsets.UTF_8));
            TimeUnit.SECONDS.sleep(1);
        }
    }

    @Test
    public void pubImages() throws IOException {
        while (true) {
            var dir = new File("C:\\Users\\Pike\\Downloads\\bin");
            var files = Arrays.stream(dir.listFiles()).sorted((file1, file2) -> file1.lastModified() >= file2.lastModified() ? 1 : -1).collect(Collectors.toList());
            for (File file : files) {
                byte[] bytes;
                try (var fileInputStream = new FileInputStream(file)) {
                    bytes = new byte[fileInputStream.available()];
                    fileInputStream.read(bytes);
                }
                nc.publish("hello", bytes);
            }
        }
    }

}
