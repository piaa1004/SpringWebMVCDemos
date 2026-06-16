package com.ysy.webmvc.annotatedcontrollers.handlermethods.requestbody;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -X POST -H "Content-Type: application/json" \
 *     -d '{"name":"alice","age":30}' http://localhost:8080/echo-body
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
