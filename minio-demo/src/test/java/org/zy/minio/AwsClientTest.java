package org.zy.minio;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class AwsClientTest {

    AmazonS3 client = AmazonS3Client.builder().withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("http://192.168.30.103:8333", "region"))
            .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials("qhx", " qihaixingtest"))).build();

    @Test
    public void getObject() throws Exception {
        var rangeObjectRequest = new GetObjectRequest("mail", "HelloWorld");
        var object = client.getObject(rangeObjectRequest);
        var fileOutputStream = new FileOutputStream("D://win10.iso");
        var bytes = new byte[1024];
        int index;
        while ((index = object.getObjectContent().read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, index);
        }

        object.close();
        fileOutputStream.close();
    }

    @Test
    public void uploadObject() throws Exception {
        var byteArrayInputStream = new ByteArrayInputStream("Hello world!".getBytes(StandardCharsets.UTF_8));
        client.putObject(new PutObjectRequest("mail", "HelloWorld", byteArrayInputStream, new ObjectMetadata()));
    }

}
