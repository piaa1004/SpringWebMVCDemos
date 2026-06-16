package com.ysy.webmvc.mvcconfig.defaultservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/ds/hello   → Spring MVC 처리
 *   curl http://localhost:8080/index.html → default servlet 으로 forward 시도
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
