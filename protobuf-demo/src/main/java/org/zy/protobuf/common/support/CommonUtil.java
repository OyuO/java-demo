package org.zy.protobuf.common.support;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CommonUtil {

    public static byte[] getFileBytes(String path) {
        var file = new File(path);
        try (var inputStream = new FileInputStream(file)) {
            var bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            return bytes;
        } catch (IOException e) {
            throw new IllegalArgumentException("读取文件异常", e);
        }
    }

    public static int bytes2int(byte[] bytes) {
        int result = 0;
        if (bytes.length == 4) {
            int a = (bytes[3] & 0xff) << 24;
            int b = (bytes[2] & 0xff) << 16;
            int c = (bytes[1] & 0xff) << 8;
            int d = (bytes[0] & 0xff);
            result = a | b | c | d;
        }
        return result;
    }

}
