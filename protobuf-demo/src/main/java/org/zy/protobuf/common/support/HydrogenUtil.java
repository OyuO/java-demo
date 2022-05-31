package org.zy.protobuf.common.support;

import co.libly.hydride.Hydrogen;
import org.zy.protobuf.common.constant.Constant;

import java.io.IOException;
import java.nio.ByteBuffer;

public class HydrogenUtil {

    public static final Hydrogen HYDROGEN = new Hydrogen();

    public static byte[] hash(byte[] message) {
        var hash = new byte[32];
        var parts = message.length / Constant.BYTES_MAX;
        if (parts == 0) {
            HYDROGEN.hydro_hash_hash(hash, hash.length, message, message.length, Constant.CONTEXT, null);
        } else {
            var hydroHashState = new Hydrogen.HydroHashState();
            HYDROGEN.hydro_hash_init(hydroHashState, Constant.CONTEXT, null);
            var byteBuffer = ByteBuffer.wrap(message);
            for (int i = 0; i < parts; i++) {
                var bytes = new byte[Constant.BYTES_MAX];
                byteBuffer.get(bytes, 0, bytes.length);
                HYDROGEN.hydro_hash_update(hydroHashState, bytes, bytes.length);
            }

            int leave = message.length % Constant.BYTES_MAX;
            var bytes = new byte[leave];
            byteBuffer.get(bytes, 0, bytes.length);
            HYDROGEN.hydro_hash_update(hydroHashState, bytes, bytes.length);
            HYDROGEN.hydro_hash_final(hydroHashState, hash, hash.length);
        }
        return hash;
    }

    public static byte[] sign(byte[] message) {
        var sign = new byte[64];
        var parts = message.length / Constant.BYTES_MAX;
        if (parts == 0) {
            HYDROGEN.hydro_sign_create(sign, message, message.length, Constant.CONTEXT, getKeys().sk);
        } else {
            var hydroSignState = new Hydrogen.HydroSignState();
            HYDROGEN.hydro_sign_init(hydroSignState, Constant.CONTEXT);
            var byteBuffer = ByteBuffer.wrap(message);
            for (int i = 0; i < parts; i++) {
                var bytes = new byte[Constant.BYTES_MAX];
                byteBuffer.get(bytes, 0, bytes.length);
                HYDROGEN.hydro_sign_update(hydroSignState, bytes, bytes.length);
            }

            var leave = message.length % Constant.BYTES_MAX;
            var bytes = new byte[leave];
            byteBuffer.get(bytes, 0, bytes.length);
            HYDROGEN.hydro_sign_update(hydroSignState, bytes, bytes.length);
            HYDROGEN.hydro_sign_final_create(hydroSignState, sign, getKeys().sk);
        }
        return sign;
    }

    public static boolean checkSign(byte[] signature, byte[] message) {
        return HYDROGEN.hydro_sign_verify(signature, message, message.length, Constant.CONTEXT, getKeys().pk) == 0;
    }

    public static Hydrogen.HydroSignKeyPair getKeys() {

        try (
                var secretStream = HydrogenUtil.class.getResourceAsStream("/key-pair/secret_key.bin");
                var publicKeyStream = HydrogenUtil.class.getResourceAsStream("/key-pair/public_key.bin");
        ) {

            var secretKeyBytes = new byte[secretStream.available()];
            secretStream.read(secretKeyBytes);
            var publicKeyBytes = new byte[publicKeyStream.available()];
            publicKeyStream.read(publicKeyBytes);
            var keyPair = new Hydrogen.HydroSignKeyPair();
            keyPair.pk = publicKeyBytes;
            keyPair.sk = secretKeyBytes;
            return keyPair;
        } catch (IOException e) {
            throw new RuntimeException("获取密钥失败!", e);
        }
    }

    public static void main(String[] args) {
        final var keys = getKeys();
    }

}
