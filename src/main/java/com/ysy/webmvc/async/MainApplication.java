package com.ysy.webmvc.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/async/callable
 *   curl http://localhost:8080/async/deferred
 *
 * 응답 스레드명이 "mvc-async-*" 인지 확인.
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
