package com.ysy.webmvc.annotatedcontrollers.handlermethods.sessionattributes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then (쿠키 jar 공유):
 *   curl -c jar -b jar http://localhost:8080/cart/start
 *   curl -c jar -b jar http://localhost:8080/cart/show
 *   curl -c jar -b jar http://localhost:8080/cart/end
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
