package com.ysy.webmvc.websocket.stomp.stompclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Run — WebSocketStompClient 빈을 다른 곳에서 주입해 외부 STOMP 서버에 연결. */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
