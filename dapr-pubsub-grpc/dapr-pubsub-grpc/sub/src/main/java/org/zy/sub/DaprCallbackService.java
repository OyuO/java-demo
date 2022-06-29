package org.zy.sub;

import com.google.protobuf.Empty;
import io.dapr.v1.AppCallbackGrpc;
import io.dapr.v1.DaprAppCallbackProtos;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DaprCallbackService extends AppCallbackGrpc.AppCallbackImplBase {
    /**
     * dapr/service1/request/hello
     * dapr/service2/response/service1.hello
     * DaprSubService handle() topics()
     * match()
     */
    @Override
    public void listTopicSubscriptions(Empty request, StreamObserver<DaprAppCallbackProtos.ListTopicSubscriptionsResponse> responseObserver) {
        log.info("Get subscribe topics!");
        var subscription = DaprAppCallbackProtos
                .TopicSubscription
                .newBuilder()
                .setPubsubName("pubsub")
                .setTopic("hello")
                .build();
        var subscriptionsResponse = DaprAppCallbackProtos.ListTopicSubscriptionsResponse.newBuilder().addSubscriptions(subscription).build();
        responseObserver.onNext(subscriptionsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void onTopicEvent(DaprAppCallbackProtos.TopicEventRequest request, StreamObserver<DaprAppCallbackProtos.TopicEventResponse> responseObserver) {
        log.info("收到了消息!");
        var topic = request.getTopic();
        var jsonStr = request.getData().toString();
        log.info("topic:{},data:{}", topic, jsonStr);
        var eventResponse = DaprAppCallbackProtos.TopicEventResponse.newBuilder().setStatus(DaprAppCallbackProtos.TopicEventResponse.TopicEventResponseStatus.SUCCESS).build();
        responseObserver.onNext(eventResponse);
        responseObserver.onCompleted();
    }
}
