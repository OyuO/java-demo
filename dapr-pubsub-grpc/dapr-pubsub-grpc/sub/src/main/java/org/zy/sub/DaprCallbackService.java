package org.zy.sub;

import com.google.protobuf.Empty;
import io.dapr.v1.AppCallbackGrpc;
import io.dapr.v1.DaprAppCallbackProtos;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DaprCallbackService extends AppCallbackGrpc.AppCallbackImplBase {
    @Override
    public void listTopicSubscriptions(Empty request, StreamObserver<DaprAppCallbackProtos.ListTopicSubscriptionsResponse> responseObserver) {
        log.info("Get subscribe topics!");
        var aHello = DaprAppCallbackProtos
                .TopicSubscription
                .newBuilder()
                .setPubsubName("default-pubsub")
                .setTopic("a.>")
                .build();
        var subscriptionsResponse = DaprAppCallbackProtos.ListTopicSubscriptionsResponse.newBuilder()
                .addSubscriptions(aHello)
                .build();
        responseObserver.onNext(subscriptionsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void onTopicEvent(DaprAppCallbackProtos.TopicEventRequest request, StreamObserver<DaprAppCallbackProtos.TopicEventResponse> responseObserver) {
        log.info("收到了消息!");
        var topic = request.getTopic();
        var str = request.getData().toString();
        log.info("topic:{},data:{}", topic, str);
        var eventResponse = DaprAppCallbackProtos.TopicEventResponse.newBuilder().setStatus(DaprAppCallbackProtos.TopicEventResponse.TopicEventResponseStatus.SUCCESS).build();
        responseObserver.onNext(eventResponse);
        responseObserver.onCompleted();
    }
}
