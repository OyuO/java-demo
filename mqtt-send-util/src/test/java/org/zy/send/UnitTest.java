package org.zy.send;

import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Timestamps;
import org.junit.Test;
import qhx.proto.weve.event.EventOuterClass;

import static com.google.protobuf.util.Timestamps.fromMillis;
import static java.lang.System.currentTimeMillis;

public class UnitTest {

    // 这里是toic
    private static final String TOPIC = "topic";

    @Test
    public void sendProtoToMqttTest() throws Exception {
        ServerMQTT server = new ServerMQTT();
        server.publishWithTopic(TOPIC, generateProtoBytes());
    }

    private static byte[] generateProtoBytes() {
        // 这里构造proto
        // 建造者模式
        return EventOuterClass
                .Event
                .newBuilder()
                .setRobotId("100")
                .setSourceValue(100)
                .setTimestamp(Timestamps.from)
                .build()
                .toByteArray();

        Timestamp timestamp = fromMillis(currentTimeMillis());
    }

}
