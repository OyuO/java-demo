package org.zy.pay;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;
import org.zy.pay.model.dto.WxPayInvokeDTO;
import org.zy.pay.service.WxPayService;

import java.io.*;
import java.util.UUID;

//@SpringBootTest
class ApplicationTests {

//    @Autowired
//    private WxPayService wxPayService;

    @Test
    void contextLoads() throws IOException {
        System.out.println(UUID.randomUUID().toString().substring(0, 32));
    }

}
