package com.ysy.webmvc.mvcconfig.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -X POST -H "Content-Type: application/json" -d '{"guestName":""}' http://localhost:8080/v/booking
 *   curl -X POST -H "Content-Type: application/json" -d '{"guestName":"alice"}' http://localhost:8080/v/booking
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
