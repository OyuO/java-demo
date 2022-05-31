package org.zy.netty.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        var socket = new Socket("localhost", 5100);
        var out = socket.getOutputStream();
        var printWriter = new PrintWriter(out);
        var in = socket.getInputStream();
        var bufferedReader = new BufferedReader(new InputStreamReader(in));
        String response;
        printWriter.write("客户端发送消息\n");
        printWriter.flush();
//        socket.shutdownOutput();
        while ((response = bufferedReader.readLine()) != null) {
            System.out.printf("%s\n", response);
            printWriter.write("客户端发送消息\n");
            printWriter.flush();
        }
//        bufferedReader.close();
//        in.close();
//        out.close();
//        printWriter.close();
//        socket.close();

    }
}
