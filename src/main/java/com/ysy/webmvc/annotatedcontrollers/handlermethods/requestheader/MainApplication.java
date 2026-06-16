package com.ysy.webmvc.annotatedcontrollers.handlermethods.requestheader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/h/ua
 *   curl http://localhost:8080/h/all
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
