package com.ysy.webmvc.annotatedcontrollers.controlleradvice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then: curl -i http://localhost:8080/boom
 *   → 500 "global: IllegalArgumentException oops"
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
