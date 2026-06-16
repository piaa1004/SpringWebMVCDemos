package com.ysy.webmvc.annotatedcontrollers.handlermethods.cookievalue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Run, then: curl -b "JSESSIONID=abc123" http://localhost:8080/c/session */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
