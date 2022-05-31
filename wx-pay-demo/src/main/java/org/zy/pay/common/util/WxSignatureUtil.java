package org.zy.pay.common.util;

import cn.hutool.core.text.CharSequenceUtil;
import org.zy.pay.common.constant.Constant;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;

public class WxSignatureUtil {

    public static String buildWxPayInvokeMessage(long timestamp, String nonceStr, String packageStr) {
        return Constant.appId + "\n"
                + timestamp + "\n"
                + nonceStr + "\n"
                + packageStr + "\n";
    }


    /**
     * @param method http请求方法(POST,GET大写)
     * @param url    url
     * @param body   请求体(json串)
     * @return 签名
     */
    public static String signature(String method, String url, String body) {
        String nonceStr = generateNonceStr();
        long timestamp = getTimestampOfSecond();
        String message = buildOrderSignatureMessage(method, url, timestamp, nonceStr, body);
        String signature = sign(message);

        return Constant.schema + CharSequenceUtil.SPACE + "mchid=\"" + Constant.mchId + "\","
                + "nonce_str=\"" + nonceStr + "\","
                + "timestamp=\"" + timestamp + "\","
                + "serial_no=\"" + Constant.SERIAL_NO + "\","
                + "signature=\"" + signature + "\"";
    }


    /**
     * @param method    方法
     * @param urlStr    urlStr
     * @param timestamp 时间戳
     * @param nonceStr  随机字符串
     * @param body      请求体
     * @return message
     */
    private static String buildOrderSignatureMessage(String method, String urlStr, long timestamp, String nonceStr, String body) {
        try {
            URL url = new URL(urlStr);
            String canonicalUrl = url.getPath() + (url.getQuery() != null ? url.getQuery() : CharSequenceUtil.EMPTY);
            return method + "\n"
                    + canonicalUrl + "\n"
                    + timestamp + "\n"
                    + nonceStr + "\n"
                    + body + "\n";
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("url formal error");
        }
    }

    /**
     * SHA256withRSA加密后再用base64加密
     *
     * @param message 消息体
     * @return 签名值
     */
    public static String sign(String message) {
        try {
            Signature sign = Signature.getInstance("SHA256withRSA");
            sign.initSign(getPrivateKey());
            sign.update(message.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(sign.sign());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("当前Java环境不支持SHA256withRSA", e);
        } catch (SignatureException e) {
            throw new RuntimeException("签名计算失败", e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException("无效的私钥", e);
        }
    }


    /**
     * 将字符串私钥转成对象
     *
     * @return PrivateKey
     */
    private static PrivateKey getPrivateKey() {
        PrivateKey privateKey = PemUtil.loadPrivateKey(new ByteArrayInputStream(Constant.PRIVATE_KEY.getBytes(StandardCharsets.UTF_8)));
        return privateKey;
    }


    /**
     * 获取随机字符串(32位)
     *
     * @return nonceStr
     */
    public static String generateNonceStr() {
        char[] nonceChars = new char[32];
        SecureRandom random = new SecureRandom();

        for (int index = 0; index < nonceChars.length; ++index) {
            nonceChars[index] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".length()));
        }

        return new String(nonceChars);
    }

    /**
     * 获取当前时间(timestamp)
     *
     * @return timestamp now
     */
    public static long getTimestampOfSecond() {
        return System.currentTimeMillis() / 1000;
    }


}
