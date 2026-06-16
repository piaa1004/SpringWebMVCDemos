package com.ysy.webmvc.annotatedcontrollers.handlermethods.responseentity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -i http://localhost:8080/re/ok
 *   curl -i http://localhost:8080/re/created
 *   curl -i http://localhost:8080/re/no-content
 *   curl -i http://localhost:8080/re/teapot
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
