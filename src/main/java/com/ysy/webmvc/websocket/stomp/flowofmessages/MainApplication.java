package com.ysy.webmvc.websocket.stomp.flowofmessages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then STOMP 클라이언트로:
 *   CONNECT ws://localhost:8080/ws-flow
 *   SUBSCRIBE destination:/topic/chat
 *   SEND destination:/app/chat  body:"hi"
 *   ← MESSAGE destination:/topic/chat  body:"broadcast: hi"
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
