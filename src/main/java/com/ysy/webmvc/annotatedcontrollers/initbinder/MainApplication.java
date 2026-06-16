package com.ysy.webmvc.annotatedcontrollers.initbinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then: curl "http://localhost:8080/parse?date=20250101"
 *  → parsed=2025-01-01
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
