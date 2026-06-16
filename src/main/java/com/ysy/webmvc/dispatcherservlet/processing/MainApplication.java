package com.ysy.webmvc.dispatcherservlet.processing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then: curl http://localhost:8080/orders
 *
 * 콘솔에서 다음 순서가 보이는지 확인:
 *   [A] preHandle → [B] preHandle → [controller] handling /orders
 *   → [B] postHandle → [A] postHandle
 *   → [B] afterCompletion → [A] afterCompletion
 *
 * (preHandle 은 등록 순서, postHandle/afterCompletion 은 역순.)
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
