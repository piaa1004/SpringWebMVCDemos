package com.ysy.webmvc.dispatcherservlet.locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/greet            → Hello
 *   curl "http://localhost:8080/greet?lang=ko"  → 안녕하세요
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
