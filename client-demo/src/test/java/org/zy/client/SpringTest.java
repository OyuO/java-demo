package org.zy.client;

import com.qhx.common.http.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zy.client.controller.TestController;

@SpringBootTest
class SpringTest {

    @Autowired
    private Client client;

    @Test
    void postTest() {
        var person = client.postForObject("http://localhost:8080/test/doPost", new TestController.Person("张三", 18), TestController.Person.class);
    }

    @Test
    void getTest() {
        var forObject = client.getForObject("http://localhost:8080/test/doGet?name=张三&age=18", TestController.Person.class);
     }

}
