package org.zy.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zy.demo.mapper.TestMapper;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private TestMapper testMapper;


    @Test
    void test() {
        var select = testMapper.select();
    }

}

