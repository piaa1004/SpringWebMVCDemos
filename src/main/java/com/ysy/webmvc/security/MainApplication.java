package com.ysy.webmvc.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -i http://localhost:8080/secure/hello                              → 401
 *   curl -i -H "Authorization: Bearer abc123" http://localhost:8080/secure/hello → 200
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
