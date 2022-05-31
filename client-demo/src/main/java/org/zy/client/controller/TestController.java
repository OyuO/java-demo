package org.zy.client.controller;

import com.qhx.common.http.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    private Client client;

    @RequestMapping("/post")
    public ResponseEntity<?> test() {
        var person = client.postForObject("http://localhost:8080/test/doPost", new Person("张三", 18), Person.class);
        return ResponseEntity.ok(null);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Person {
        private String name;

        private Integer age;
    }
}
