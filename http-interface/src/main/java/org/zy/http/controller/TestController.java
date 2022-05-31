package org.zy.http.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/test")
@RestController
public class TestController {

    @PostMapping("/doPost")
    public ResponseEntity<?> doPost(@RequestBody Person person) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(person);
    }

    @GetMapping("/doGet")
    public ResponseEntity<?> doPost(@RequestParam String name, @RequestParam int age) {
        System.out.printf("Name: %s, Age: %d", name, age);
        return ResponseEntity.ok(new Person("王五", 100));
    }


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Person {
        private String name;

        private Integer age;
    }
}
