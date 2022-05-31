package org.zy.netty.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;

public class Server {

    public static void main(String[] args) throws IOException {
        var serverSocket = new ServerSocket(5100);
        var clientSocket = serverSocket.accept();
        var in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        var out = new PrintWriter(clientSocket.getOutputStream(), true);
        String request;
        while (true) {
            while ((request = in.readLine()) != null) {
                System.out.printf("%s\n", request);
                out.println("服务端发送消息\n");
            }
        }
    }
}
