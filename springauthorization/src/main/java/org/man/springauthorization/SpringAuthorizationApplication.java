package org.man.springauthorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringAuthorizationApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringAuthorizationApplication.class, args);
    }

}
