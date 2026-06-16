package com.ysy.webmvc.annotatedcontrollers.handlermethods.sessionattribute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -c jar -b jar http://localhost:8080/sess/put
 *   curl -c jar -b jar http://localhost:8080/sess/read
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
