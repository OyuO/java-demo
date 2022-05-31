package org.zy.grpc;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.qhx.proto.PrepayRequestProto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.zy.grpc.proto.HelloReply;

@SpringBootTest
public class GenericTest {

    @Test
    public void test() throws InvalidProtocolBufferException {
        var prepayRequestProto = PrepayRequestProto.newBuilder().setOpenId("fdfdsfds").setChannel("fdsfdsfds").setOrderId(1232321).build();

        var s = prepayRequestProto.toString();


    }

}
