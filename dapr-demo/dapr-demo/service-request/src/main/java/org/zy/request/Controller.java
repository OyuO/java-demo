package org.zy.request;

import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.zy.proto.HelloServiceGrpc;
import org.zy.proto.Message;

@RestController
public class Controller {

    private final RestTemplate restTemplate;

    private final HelloServiceGrpc.HelloServiceBlockingStub stub;

    private final Message message;

    public Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        var channel = ManagedChannelBuilder.forTarget("localhost:3501").usePlaintext().build();
        Metadata headers = new Metadata();
        headers.put(Metadata.Key.of("dapr-app-id", Metadata.ASCII_STRING_MARSHALLER), "response");
        this.stub = HelloServiceGrpc.newBlockingStub(channel).withInterceptors(MetadataUtils.newAttachHeadersInterceptor(headers));
        this.message = Message.newBuilder().setMsg("Hello response!").build();

    }

    @RequestMapping("/hello/http")
    public ResponseEntity<?> http() {
        var str = restTemplate.getForObject("http://localhost:3500/v1.0/invoke/response/method/hello", String.class);
        return ResponseEntity.ok(str);
    }

    @RequestMapping("/hello/grpc")
    public ResponseEntity<?> grpc() {
        var message = this.stub.hello(this.message);
        return ResponseEntity.ok(message.getMsg());
    }

}
