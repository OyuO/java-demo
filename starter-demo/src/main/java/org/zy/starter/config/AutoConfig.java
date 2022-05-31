package org.zy.starter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zy.starter.service.HelloService;

@Configuration
public class AutoConfig {
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
