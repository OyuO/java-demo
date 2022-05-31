package org.zy.pay.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zy.pay.service.WxPayService;

import java.io.IOException;

@RequestMapping("/pay")
@RestController
public class WxPayController {

    @Autowired
    private WxPayService wxPayService;

    @RequestMapping("/prepay")
    public ResponseEntity<?> prepay() {
        return ResponseEntity.ok(wxPayService.prepay());
    }

    @RequestMapping("/refund")
    public ResponseEntity<?> refund() {
        return ResponseEntity.ok(wxPayService.refund());
    }


    @PostMapping("/notify")
    public ResponseEntity<?> payNotify(Object object) throws IOException {
        System.out.println("Pay Notify.........................................................................................");
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/refund/notify")
    public ResponseEntity<?> refundNotify(Object object) throws IOException {
        System.out.println("Refund Notify.........................................................................................");
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/hello")
    public ResponseEntity<?> hello(Person person) {
//        System.out.println("hello " + person.name);
        return ResponseEntity.ok(new Person("李四",100));
    }

    @Data
    public static class Person {
        private String name;

        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public Person() {
        }
    }

}
