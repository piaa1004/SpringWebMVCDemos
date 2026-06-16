package com.ysy.webmvc.dispatcherservlet.interception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -i http://localhost:8080/api/users                          → 401
 *   curl -i -H "X-API-KEY: secret" http://localhost:8080/api/users   → 200
 *   curl -i http://localhost:8080/api/public/health                  → 200 (excludePath)
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
