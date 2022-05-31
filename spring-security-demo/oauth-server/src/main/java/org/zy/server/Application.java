package org.zy.server;

import org.springframework.beans.BeansException;
<<<<<<< HEAD
=======
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> a29381f3814a8d67f0748d2775e1415d69475b0c
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class Application implements ApplicationContextAware {

<<<<<<< HEAD
    public static ApplicationContext context;
=======
    @Autowired
    private static ApplicationContext applicationContext;
>>>>>>> a29381f3814a8d67f0748d2775e1415d69475b0c

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
<<<<<<< HEAD
        Application.context = applicationContext;
    }

=======
        this.applicationContext = applicationContext;
    }
>>>>>>> a29381f3814a8d67f0748d2775e1415d69475b0c
}
