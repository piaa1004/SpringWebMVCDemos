package com.ysy.webmvc.annotatedcontrollers.handlermethods.returntypes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/r/string
 *   curl http://localhost:8080/r/map
 *   curl -i http://localhost:8080/r/entity
 *   curl http://localhost:8080/r/callable
 *   curl http://localhost:8080/r/deferred
 *   curl -N http://localhost:8080/r/sse
 *   curl -N http://localhost:8080/r/stream
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
