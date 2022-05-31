package org.zy.pay.common.util;


import org.zy.pay.model.dto.WxPayInvokeDTO;

public class WxUtil {

    public static WxPayInvokeDTO buildWxPayInvokeRequest(String prepayId) {
        String packageStr = String.format("prepay_id=%s", prepayId);
        long timestamp = WxSignatureUtil.getTimestampOfSecond();
        String nonceStr = WxSignatureUtil.generateNonceStr();
        String message = WxSignatureUtil.buildWxPayInvokeMessage(timestamp, nonceStr, packageStr);
        String paySign = WxSignatureUtil.sign(message);
        return WxPayInvokeDTO
                .builder()
                .timeStamp(Long.toString(timestamp))
                .nonceStr(nonceStr)
                .packageStr(packageStr)
                .paySign(paySign)
                .build();
    }
}
