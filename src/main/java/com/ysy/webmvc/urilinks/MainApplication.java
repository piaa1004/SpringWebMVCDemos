package com.ysy.webmvc.urilinks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/uri/static
 *   curl http://localhost:8080/uri/current
 *   curl http://localhost:8080/uri/method-link
 *   curl http://localhost:8080/items/123
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
