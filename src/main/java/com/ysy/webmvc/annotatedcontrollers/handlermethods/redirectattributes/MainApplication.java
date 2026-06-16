package com.ysy.webmvc.annotatedcontrollers.handlermethods.redirectattributes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Run, then: curl -L "http://localhost:8080/r/post?name=alice" */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
