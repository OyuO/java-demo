package org.zy.protobuf.common.constant;

import java.nio.charset.StandardCharsets;

public interface Constant {

    byte[] CONTEXT = "QHX/WEVE".getBytes(StandardCharsets.UTF_8);

    int PAYLOAD_COMMAND = 0;

    int PAYLOAD_PACKAGE = 1;

    int BYTES_MAX = 65535;


}
