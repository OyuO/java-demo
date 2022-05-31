package org.zy.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    private HelloService2 helloService2;

    public String hello() {
        return helloService2.hello();
    }
}
