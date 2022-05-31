package org.zy.okhttp;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import org.junit.Test;

import java.io.IOException;

public class ClientTest {

    @Test
    public void posJsonTest() throws IOException {
        var response = new Client().postJson("http://localhost:8080/test/hello", JSON.toJSONString(new Person("张三", 18)));
        var string = response.body().string();
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
