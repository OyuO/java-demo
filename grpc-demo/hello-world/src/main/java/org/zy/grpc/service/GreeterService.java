package org.zy.grpc.service;

import io.grpc.stub.StreamObserver;
import org.zy.grpc.proto.GreeterGrpc;
import org.zy.grpc.proto.HelloReply;
import org.zy.grpc.proto.HelloRequest;

public class GreeterService extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        var message = String.format("你好 %s,很高兴认识你", request.getName());
        var helloReply = HelloReply.newBuilder().setMessage(message).build();
        responseObserver.onNext(helloReply);
        responseObserver.onCompleted();
    }
}
