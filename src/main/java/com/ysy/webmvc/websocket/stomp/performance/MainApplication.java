package com.ysy.webmvc.websocket.stomp.performance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Run — 부하 측정용 STOMP 클라이언트가 ws://localhost:8080/ws-perf 로 접속. */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
