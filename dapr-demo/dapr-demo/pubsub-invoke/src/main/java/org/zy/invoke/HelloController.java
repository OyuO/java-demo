package org.zy.invoke;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class HelloController {
    private final HelloService helloService;

    @GetMapping("/hello")
    public ResponseEntity<?> hello(@RequestParam String name) {
        var msg = helloService.hello(name);
        return ResponseEntity.ok(msg);
    }

}
