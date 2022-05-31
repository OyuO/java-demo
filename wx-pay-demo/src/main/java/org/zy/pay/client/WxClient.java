package org.zy.pay.client;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.qhx.common.http.Client;
import com.qhx.common.support.JsonUtil;
import okhttp3.Headers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zy.pay.common.constant.Constant;
import org.zy.pay.common.util.WxSignatureUtil;
import org.zy.pay.model.dto.WxPrepayRequestDTO;
import org.zy.pay.model.dto.WxPrepayResponseDTO;
import org.zy.pay.model.dto.WxRefundRequestDTO;

@Component
public class WxClient {

    @Autowired
    private Client client;

    public String prepay(WxPrepayRequestDTO wxPrepayRequestDTO) {
//
//        var headers = new Headers.Builder().add("User-Agent", "PostmanRuntime/7.28.4").add("Authorization", WxSignatureUtil.signature("POST", Constant.prepayUrl, JsonUtil.toJson(wxPrepayRequestDTO))).add("Accept", "*/*").build();
//        OkHttpClient okHttpClient = new OkHttpClient();
//        var requestBody = RequestBody.create(MediaType.parse("application/json;charset=utf-8"), JsonUtil.toJson(wxPrepayRequestDTO));
//        var request = new Request.Builder().url(Constant.prepayUrl).post(requestBody).headers(headers).build();
//        try {
//            var response = okHttpClient.newCall(request).execute();
//            var jsonNodes = JsonUtil.toObject(new String(response.body().bytes()), ObjectNode.class);
//            return jsonNodes.get("prepay_id").asText();
//        } catch (IOException e) {
//            throw new IllegalArgumentException("illegal arguments");
//        }
//
        var headers = Headers.of("User-Agent", "qhx-pay", Client.AUTHORIZATION, WxSignatureUtil.signature("POST", Constant.prepayUrl, JsonUtil.toJson(wxPrepayRequestDTO)), "Accept", "*/*");
        var wxPrepayResponseDTO = client.postForObject(Constant.prepayUrl, wxPrepayRequestDTO, WxPrepayResponseDTO.class, headers);
        return wxPrepayResponseDTO.getPrepayId();
    }

    public String refund(WxRefundRequestDTO wxRefundRequestDTO) {
//
//        var signature = WxSignatureUtil.signature("POST", Constant.REFUND_URL, JsonUtil.toJson(wxRefundRequestDTO));
//        var headers = new Headers.Builder().add("User-Agent", "PostmanRuntime/7.28.4").add("Accept", "*/*").add("Authorization", signature).build();
//        OkHttpClient okHttpClient = new OkHttpClient();
//        var requestBody = RequestBody.create(MediaType.parse("application/json;charset=utf-8"), JsonUtil.toJson(wxRefundRequestDTO));
//        var request = new Request.Builder().url(Constant.REFUND_URL).post(requestBody).headers(headers).build();
//        try {
//            var response = okHttpClient.newCall(request).execute();
//            var jsonNodes = JsonUtil.toObject(new String(response.body().bytes()), ObjectNode.class);
//            return null;
//        } catch (IOException e) {
//            throw new IllegalArgumentException("illegal arguments");
//        }
        return null;
    }

}
