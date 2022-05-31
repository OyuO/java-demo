package org.zy.pay.common.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

/**
 * Pem密钥获取工具类
 *
 * @author Pike
 */
public class PemUtil {
    public PemUtil() {
    }

    public static PrivateKey loadPrivateKey(InputStream inputStream) {
        try {
            ByteArrayOutputStream array = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];

            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                array.write(buffer, 0, length);
            }
            String privateKey = array.toString("utf-8").replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "").replaceAll("\\s+", "");
            KeyFactory kf = KeyFactory.getInstance("RSA");
            return kf.generatePrivate(new PKCS8EncodedKeySpec(Base64.getDecoder().decode(privateKey)));
        } catch (NoSuchAlgorithmException var6) {
            throw new RuntimeException("当前Java环境不支持RSA", var6);
        } catch (InvalidKeySpecException var7) {
            throw new RuntimeException("无效的密钥格式");
        } catch (IOException var8) {
            throw new RuntimeException("无效的密钥");
        }
    }

    public static X509Certificate loadCertificate(InputStream inputStream) {
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X509");
            X509Certificate cert = (X509Certificate) cf.generateCertificate(inputStream);
            cert.checkValidity();
            return cert;
        } catch (CertificateExpiredException var3) {
            throw new RuntimeException("证书已过期", var3);
        } catch (CertificateNotYetValidException var4) {
            throw new RuntimeException("证书尚未生效", var4);
        } catch (CertificateException var5) {
            throw new RuntimeException("无效的证书", var5);
        }
    }
}