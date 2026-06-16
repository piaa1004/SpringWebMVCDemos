package com.ysy.webmvc.annotatedcontrollers.handlermethods.jacksonjson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/j/time
 *   curl http://localhost:8080/j/public      → name 만 노출
 *   curl http://localhost:8080/j/internal    → name + secret
 *   curl http://localhost:8080/j/dynamic     → MappingJacksonValue 로 public view
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
