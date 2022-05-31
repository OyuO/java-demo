package org.zy.file;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

@SpringBootTest
class FileDemoApplicationTests {

    public static void main(String[] args) throws IOException {
        var fromFile = new File("C:\\Users\\Pike\\Desktop\\CLion-2021.2.exe");
        var toFile = new File("C:\\Users\\Pike\\Desktop\\c.exe");

        try (var inStream = new FileInputStream(fromFile);
             var outStream = new FileOutputStream(toFile)
        ) {
            var buffer = new byte[1024];
            int length;
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
                outStream.flush();
            }
        }
    }

    @Test
    void contextLoads() {
    }

}
