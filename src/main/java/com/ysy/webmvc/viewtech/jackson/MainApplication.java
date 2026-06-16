package com.ysy.webmvc.viewtech.jackson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/jv/json
 *   curl http://localhost:8080/jv/xml
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
