package com.ysy.webmvc.mvcconfig.viewcontrollers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/                → home view
 *   curl -i http://localhost:8080/health       → 200 (no body)
 *   curl -i http://localhost:8080/old-path     → 302 → /
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
