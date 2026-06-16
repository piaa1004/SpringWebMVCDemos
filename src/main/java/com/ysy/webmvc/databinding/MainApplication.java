package com.ysy.webmvc.databinding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -X POST -d "product=book&quantity=2&customerEmail=a@b" http://localhost:8080/db/order
 *   curl -X POST -d "product=&quantity=-1" http://localhost:8080/db/order   → errors 출력
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
