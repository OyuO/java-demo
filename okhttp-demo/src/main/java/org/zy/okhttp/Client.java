package org.zy.okhttp;

import okhttp3.*;

import java.io.IOException;

public class Client {

    private OkHttpClient client = new OkHttpClient();

    public Response postJson(String url, String string) {

        var requestBody = RequestBody.create(MediaType.parse("application/json;charset=utf-8"), string);

        var request = new Request.Builder().url(url).post(requestBody).build();

        try {
            return client.newCall(request).execute();
        } catch (IOException e) {
            throw new RuntimeException("okhttp exception");
        }

    }
}
