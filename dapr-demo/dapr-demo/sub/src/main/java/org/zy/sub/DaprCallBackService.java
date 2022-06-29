package org.zy.sub;

import com.google.protobuf.Empty;
import io.dapr.v1.AppCallbackGrpc;
import io.dapr.v1.DaprAppCallbackProtos;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DaprCallBackService extends AppCallbackGrpc.AppCallbackImplBase {
    @Override
    public void listTopicSubscriptions(Empty request, StreamObserver<DaprAppCallbackProtos.ListTopicSubscriptionsResponse> responseObserver) {
        log.info("获取topic!");
        var subscription = DaprAppCallbackProtos
                .TopicSubscription
                .newBuilder()
                .setPubsubName("pubsub")
                .setTopic("hello")
                .setRoutes(DaprAppCallbackProtos
                        .TopicRoutes
                        .newBuilder()
                        .addRules(DaprAppCallbackProtos
                                .TopicRule
                                .newBuilder()
                                .setPath("hello")
                                .build())
                        .build())
                .build();
        var subscriptionsResponse = DaprAppCallbackProtos.ListTopicSubscriptionsResponse.newBuilder().addSubscriptions(subscription).build();
        responseObserver.onNext(subscriptionsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void onTopicEvent(DaprAppCallbackProtos.TopicEventRequest request, StreamObserver<DaprAppCallbackProtos.TopicEventResponse> responseObserver) {
        log.info("收到了消息!");
        var topic = request.getTopic();
        var data = request.getData().toString();
        var path = request.getPath();
        log.info("topic:{},data:{},path:{}", topic, data, path);
        var eventResponse = DaprAppCallbackProtos.TopicEventResponse.newBuilder().setStatus(DaprAppCallbackProtos.TopicEventResponse.TopicEventResponseStatus.SUCCESS).build();
        responseObserver.onNext(eventResponse);
        responseObserver.onCompleted();
    }

}
