package org.zy.minio;

import io.minio.*;
import io.minio.errors.*;
import io.minio.messages.Item;
import org.junit.Test;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.LinkedBlockingQueue;

public class MinioClientTest {

//    private MinioClient client = MinioClient.builder().endpoint("http://127.0.0.1:9000").credentials("admin", "12345678").build();

    private MinioClient client = MinioClient.builder().region("region").endpoint("http://192.168.30.103:8333").credentials("qhx", " qihaixingtest").build();

    //    @Test
//    public void listBuckets() throws Exception {
//        var buckets = client.listBuckets();
//    }
//
//    /**
//     * 新建bucket -- 默认region
//     *
//     * @throws Exception
//     */
//    @Test
//    public void makeBucket1() throws Exception {
//        client.makeBucket(MakeBucketArgs.builder().bucket("bucket").build());
//    }
//
//    /**
//     * 新建bucket -- 自定义bucket
//     *
//     * @throws Exception
//     */
//    @Test
//    public void makeBucket2() throws Exception {
//        client.makeBucket(MakeBucketArgs.builder().bucket("bucket-region").region("shenzhen").build());
//    }
//
//    @Test
//    public void makeBucket3() throws Exception {
//        client.makeBucket(MakeBucketArgs.builder().bucket("bucket-lock").region("shenzhen").build());
//    }
//
//    @Test
//    public void setBucketTags() throws Exception {
//        var map = new HashMap<String, String>();
//        map.put("Project", "Project One");
//        map.put("User", "jsmith");
//        client.setBucketTags(SetBucketTagsArgs.builder().bucket("bucket-default").tags(map).build());
//    }
//
//    @Test
//    public void encode() {
//        var bytes = "Hello World!".getBytes(StandardCharsets.UTF_8);
//    }
//
//    /**
//     * 保存二进制流
//     *
//     * @throws Exception
//     */
//    @Test
//    public void putObject() throws Exception {
//        var stringBuilder = new StringBuilder();
//        for (int i = 0; i < 1000000; i++) {
//            stringBuilder.append("Hello World!");
//        }
//        var bytes = stringBuilder.toString().getBytes(StandardCharsets.UTF_8);
//        var inputStream = new ByteArrayInputStream(bytes);
//        client.putObject(PutObjectArgs.builder().bucket("bucket").object("hello2").stream(inputStream, 1024 * 1024 * 6, -1).contentType("string").build());
////        var inputStream = new FileInputStream("D:\\安装包\\win10.iso");
////        var objectWriteResponse = client.putObject(PutObjectArgs.builder().bucket("bucket").object("bigInpustStream").stream(inputStream, -1, 1024 * 1024 * 50).build());
//    }
//
//    @Test
//    public void composesObject() throws Exception {
//        var composeSources = new ArrayList<ComposeSource>();
//        composeSources.add(ComposeSource.builder().bucket("bucket").object("hello1").build());
//        composeSources.add(ComposeSource.builder().bucket("bucket").object("hello2").build());
//        client.composeObject(ComposeObjectArgs.builder().bucket("bucket").object("hello").sources(composeSources).build());
//
//    }
//
//    /**
//     * 获取二进制流
//     *
//     * @throws Exception
//     */
//    @Test
//    public void getObject() throws Exception {
//        try (InputStream stream = client.getObject(GetObjectArgs.builder().bucket("bucket").object("inputstream").build())) {
//            int by = 0;
//            while ((by = stream.read()) != -1) {
//                System.out.println(by);
//            }
//        }
//    }
//
    @Test
    public void uploadObject() throws Exception {
        var objectWriteResponse = client.uploadObject(UploadObjectArgs.builder().bucket("weve-dev").object("test/abc/pro1to.zip").filename("E:\\文档\\weve-proto.zip").build());
    }

    @Test
    public void downloadObject() throws Exception {
        client.downloadObject(DownloadObjectArgs.builder().bucket("weve-dev").object("map.doc").filename("D:\\map.doc").build());
    }

    @Test
    public void listObjects() throws Exception {

        var results = client.listObjects(ListObjectsArgs.builder().bucket("weve-dev").recursive(true).prefix("test/abc/proto.zip").build());
        results.forEach(result -> {
            try {
                System.out.println(result.get().objectName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

}
