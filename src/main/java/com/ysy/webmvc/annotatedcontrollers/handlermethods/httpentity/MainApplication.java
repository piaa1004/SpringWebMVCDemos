package com.ysy.webmvc.annotatedcontrollers.handlermethods.httpentity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Run, then: curl -X POST -H "Content-Type: text/plain" -d "hi" http://localhost:8080/he */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
