package com.ysy.webmvc.versioning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -H "X-API-Version: 1" http://localhost:8080/api/users
 *   curl -H "X-API-Version: 2" http://localhost:8080/api/users
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
