package org.zy.randomaccessfile.demo;


import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class JunitTest {

    @Test
    public void testCreateFile() throws IOException {
        var raf = new RandomAccessFile("C:\\Users\\Pike\\Desktop\\random\\createFileTest.txt", "rw");
        raf.writeChars("abcdefghijklmnopqrstuvwxyz\n");
        raf.writeChars("9876543210\n");
        raf.close();
    }

    @Test
    public void testAppendWrite() throws IOException {
        var raf = new RandomAccessFile("C:\\Users\\Pike\\Desktop\\random\\createFileTest.txt", "rw");
        var length = raf.length();
        raf.seek(length);

        raf.writeBoolean(true);
        raf.writeByte(0x41);
        raf.writeChar('a');
        raf.writeShort(0x3c3c);
        raf.writeInt(0x75);
        raf.writeLong(0x1234567890123456L);
        raf.writeFloat(4.7f);
        raf.writeDouble(8.256);
        raf.writeUTF("UTF严");
        raf.writeChar('\n');
        var length1 = raf.length();
        raf.close();
    }


    @Test
    public void testRead() throws IOException {
        var raf = new RandomAccessFile("C:\\Users\\Pike\\Desktop\\random\\createFileTest.txt", "r");
        var c = raf.readChar();
        System.out.println(c);
        var c1 = raf.readChar();
        System.out.println(c1);
        raf.seek(54);
        var buf = new byte[20];
        raf.read(buf, 0, buf.length);
        System.out.println(new String(buf));
        raf.close();
    }

}
