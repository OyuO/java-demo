package org.zy.protobuf.service;

import com.google.protobuf.ByteString;
import org.springframework.stereotype.Service;
import org.zy.protobuf.common.constant.Constant;
import org.zy.protobuf.common.support.CommonUtil;
import org.zy.protobuf.common.support.HydrogenUtil;
import qhx.proto.weve.update.CommandOuterClass;
import qhx.proto.weve.update.EnvelopeOuterClass;
import qhx.proto.weve.update.Manifest;
import qhx.proto.weve.update.PackageOuterClass;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

import static org.zy.protobuf.common.support.HydrogenUtil.HYDROGEN;

@Service
public class EnvelopeService {

    public void generateTwoFiles(String in, String out) {
        var commandEnvelope = generateEnvelope(getCommand(in), Constant.PAYLOAD_COMMAND);
        var packageEnvelope = generateEnvelope(getPackage(in), Constant.PAYLOAD_PACKAGE);
        var directory = new File(out);
        directory.mkdirs();
        try (
                var commandFileOutPutStream = new FileOutputStream(new File(directory, "command_envelope.bin"));
                var packageFileOutPutStream = new FileOutputStream(new File(directory, "package_envelope.bin"))
        ) {
            commandEnvelope.writeTo(commandFileOutPutStream);
            packageEnvelope.writeTo(packageFileOutPutStream);
        } catch (IOException e) {
            throw new IllegalArgumentException("路径异常,写出文件失败");
        }
    }


    private EnvelopeOuterClass.Envelope generateEnvelope(byte[] payload, int type) {
        var builder = EnvelopeOuterClass
                .Envelope
                .newBuilder()
                .setPayloadSeal(getSeal(payload))
                .setPayload(ByteString.copyFrom(payload))
                // Q U 00 00
                .setMagic(getMagic())
                .setTo(300L)
                .setFrom(100L)
                .setTimestamp(System.currentTimeMillis())
                .setSerialNo(200L)
                // 0: command, 1: package
                .setPayloadType(type)
                .setPayloadSize(payload.length);
        var envelopPayload = envelopPayload(builder);
        builder.setEnvelopeSeal(getSeal(envelopPayload));
        return builder.build();

    }

    private byte[] envelopPayload(EnvelopeOuterClass.Envelope.Builder envelopBuilder) {
        // 4 + 8 + 8 + 8 + 8 + 4 + 4 + 64 = 108
        // 顺序 magic + to + from + timestamp + serial_no + payload_type + payload_size + payload_seal.signature
        var byteBuffer = ByteBuffer.allocate(108);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return byteBuffer
                .putInt(envelopBuilder.getMagic())
                .putLong(envelopBuilder.getTo())
                .putLong(envelopBuilder.getFrom())
                .putLong(envelopBuilder.getTimestamp())
                .putLong(envelopBuilder.getSerialNo())
                .putInt(envelopBuilder.getPayloadType())
                .putInt(envelopBuilder.getPayloadSize())
                .put(envelopBuilder.getPayloadSeal().getSignature().toByteArray()).array();
    }


    private EnvelopeOuterClass.Seal getSeal(byte[] payload) {
        return EnvelopeOuterClass
                .Seal
                .newBuilder()
                .setHash(ByteString.copyFrom(HydrogenUtil.hash(payload)))
                .setSignature(ByteString.copyFrom(HydrogenUtil.sign(payload)))
                .setSignaturePubkey(ByteString.copyFrom(HydrogenUtil.getKeys().pk))
                .build();
    }

    private byte[] getPackage(String path) {
        var packageBuilder = PackageOuterClass
                .Package
                .newBuilder()
                .setManifest(getManifest(path));
        // TODO 测试不同的文件路径
        var directory = getAndCheckPackage(path);
        var files = directory.listFiles();
        for (File file : files) {
            try {
                packageBuilder.addEntries(ByteString.readFrom(new FileInputStream(file)));
            } catch (IOException e) {
                throw new IllegalArgumentException("读取文件夹中的文件失败!");
            }
        }
        return packageBuilder.build().toByteArray();
    }


    public byte[] getCommand(String path) {
        return CommandOuterClass
                .Command
                .newBuilder()
                .setType(CommandOuterClass.CommandType.COMMAND_TYPE_UPDATE_REQUEST)
                .setOptions(ByteString.copyFrom("update", StandardCharsets.UTF_8))
                .setManifest(getManifest(path))
                .setPackageUri("https://www.baidu.com")
                .build()
                .toByteArray();
    }


    private Manifest.PackageManifest.Builder getManifest(String path) {
        var directory = getAndCheckPackage(path);
        var files = directory.listFiles();
        var timestamp = System.currentTimeMillis();
        var manifestBuilder = Manifest.PackageManifest
                .newBuilder()
                .setPackageId("packageId")
                .setVersion("Snapshot-0.0.1")
                .setTimestamp(timestamp)
                .setFileCount(files.length);
        int totalSize = 0;
        for (int i = 0; i < files.length; i++) {
            var file = files[i];
            try (var in = new FileInputStream(file)) {
                var inBytes = new byte[in.available()];
                in.read(inBytes);
                var hash = HydrogenUtil.hash(inBytes);
                var manifestEntry = Manifest.PackageManifestEntry
                        .newBuilder()
                        .setIndex(i)
                        .setName(file.getName())
                        .setSize(inBytes.length)
                        .setVersion("Snapshot-0.0.1")
                        .setTimestamp(timestamp)
                        .setHash(ByteString.copyFrom(hash))
                        .build();
                manifestBuilder.addEntry(manifestEntry);
                totalSize += inBytes.length;
            } catch (IOException e) {
                throw new IllegalArgumentException("读取文件夹中的文件失败!");
            }
        }
        return manifestBuilder.setTotalSize(totalSize);
    }

    public File getAndCheckPackage(String path) {
        var directory = new File(path);
        if (!directory.exists()) {
            throw new IllegalArgumentException("directory is not exists!");
        }

        if (directory.isFile()) {
            throw new IllegalArgumentException("It's a file,not directory");
        }

        if (directory.listFiles().length == 0) {
            throw new IllegalArgumentException("The directory is empty");
        }
        return directory;
    }

    public int getMagic() {
        var bytes = new byte[4];
        bytes[0] = 'Q';
        bytes[1] = 'U';
        return CommonUtil.bytes2int(bytes);
    }

}

