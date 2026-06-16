package com.ysy.webmvc.annotatedcontrollers.handlermethods.flashattributes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Run, then: curl -c jar -b jar -L "http://localhost:8080/flash/post?name=alice" */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
