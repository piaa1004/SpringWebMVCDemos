package com.ysy.webmvc.annotatedcontrollers.handlermethods.requestparam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl "http://localhost:8080/q/basic"
 *   curl "http://localhost:8080/q/basic?name=alice&age=30"
 *   curl "http://localhost:8080/q/list?tag=a&tag=b"
 *   curl "http://localhost:8080/q/map?x=1&y=2"
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
