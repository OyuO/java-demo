package org.zy.invoke;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import java.util.Arrays;

@Slf4j
@RestController
public class DaprController {

    @RequestMapping("/dapr/subscribe")
    public ResponseEntity<?> http() {
        var list = Arrays.asList(new DaprSubscribe("pubsub", "dapr/sevice1/response", "helloHandler"));
        return ResponseEntity.ok(list);
    }


    @RequestMapping("/helloHandler")
    public ResponseEntity<?> helloHandler(ServletRequest servletRequest) {
        log.info("收到了一条消息!");
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
