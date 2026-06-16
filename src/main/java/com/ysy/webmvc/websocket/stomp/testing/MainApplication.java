package com.ysy.webmvc.websocket.stomp.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Run — 단위 테스트는 직접 TestableController.upper("foo") 호출, 통합 테스트는 WebSocketStompClient 사용. */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
