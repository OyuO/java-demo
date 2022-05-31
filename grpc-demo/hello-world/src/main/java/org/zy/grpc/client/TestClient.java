package org.zy.grpc.client;

import io.grpc.ManagedChannelBuilder;
import com.qhx.proto.OrderNotifyRequestProto;
import com.qhx.proto.PosServiceGrpc;

public class TestClient {

    private final PosServiceGrpc.PosServiceBlockingStub blockingStub;

    public TestClient() {
        var channel = ManagedChannelBuilder.forTarget("localhost:50140").usePlaintext().build();
        this.blockingStub = PosServiceGrpc.newBlockingStub(channel);
    }

    public void test() {
        var orderNotifyRequestProto = OrderNotifyRequestProto.newBuilder().setStatus("SUCCESS").build();
        var orderNotifyResponseProto = blockingStub.notifyHandle(orderNotifyRequestProto);
    }

    public static void main(String[] args) {
        var testClient = new TestClient();
        testClient.test();
    }
}
