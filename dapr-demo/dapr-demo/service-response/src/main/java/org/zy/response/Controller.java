package org.zy.response;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/hello")
    public ResponseEntity<?> http() {
        return ResponseEntity.ok("Hello world!");
    }
}
