package org.zy.response;

import io.grpc.stub.StreamObserver;
import org.zy.proto.HelloServiceGrpc;
import org.zy.proto.Message;

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void hello(Message request, StreamObserver<Message> responseObserver) {
        System.out.println(request.getMsg());
        var message = Message.newBuilder().setMsg("Hello request!").build();
        responseObserver.onNext(message);
        responseObserver.onCompleted();
    }

}
