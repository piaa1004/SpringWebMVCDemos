package com.ysy.webmvc.dispatcherservlet.exceptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -i http://localhost:8080/throw/illegal-arg   → 400 "bad-arg: name is blank"
 *   curl -i http://localhost:8080/throw/illegal-state → 500 (SimpleMappingExceptionResolver)
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
