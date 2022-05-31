package org.zy.hello.controller;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public ResponseEntity<?> hello(@RequestBody Person person) {
        return ResponseEntity.badRequest().body(person);
    }


    @Data
    public static class Person {
        private String name;

        private Integer age;

        public Person() {
        }

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
}
