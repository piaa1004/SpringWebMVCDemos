package com.ysy.webmvc.websocket.stomp.websocketscope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Run, then STOMP 클라이언트가 ws://localhost:8080/ws-scope 로 접속. */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
