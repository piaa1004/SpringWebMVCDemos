package com.ysy.webmvc.annotatedcontrollers.handlermethods.typeconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl "http://localhost:8080/conv/date?d=2025-01-31"
 *   curl "http://localhost:8080/conv/percent?p=12%25"
 *   curl "http://localhost:8080/conv/color?c=red"
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}