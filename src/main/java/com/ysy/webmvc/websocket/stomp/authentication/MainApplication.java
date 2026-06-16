package com.ysy.webmvc.websocket.stomp.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Run — 실제 인증은 spring-security 의존성 추가 후 SecurityFilterChain 으로 구성. */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
