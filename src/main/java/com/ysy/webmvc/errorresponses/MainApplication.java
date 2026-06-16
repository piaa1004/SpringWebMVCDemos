package com.ysy.webmvc.errorresponses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -i http://localhost:8080/err/quick     → 422 application/problem+json
 *   curl -i http://localhost:8080/err/problem   → 400 + field 속성 포함
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
