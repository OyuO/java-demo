package org.zy.sub;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@Slf4j
@RestController
public class Controller {


    @GetMapping("/dapr/subscribe")
    public ResponseEntity<?> http() {
        var list = Arrays.asList(new DaprSubscribe("pubsub", "hello", "helloHandler"));
        return ResponseEntity.ok(list);
    }


    @RequestMapping("/helloHandler")
    public ResponseEntity<?> helloHandler(@RequestBody Map<String, Object> map) throws IOException {
        for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {
            System.out.println(stringObjectEntry.getKey());
        }
        return ResponseEntity.ok("SUCCESS");
    }


    @AllArgsConstructor
    @Data
    public class DaprSubscribe {

        private String pubsubname;

        private String topic;

        private String route;
    }


}
