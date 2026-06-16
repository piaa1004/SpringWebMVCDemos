package com.ysy.webmvc.annotatedcontrollers.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -X POST -H "Content-Type: application/json" \
 *     -d '{"username":"a","email":"not-email"}' \
 *     http://localhost:8080/signup
 *   → 400 + 검증 에러 목록
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
