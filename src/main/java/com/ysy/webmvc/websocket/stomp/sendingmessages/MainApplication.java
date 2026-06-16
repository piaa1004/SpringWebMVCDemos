package com.ysy.webmvc.websocket.stomp.sendingmessages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl "http://localhost:8080/push?msg=hello"   → 구독자가 /topic/news 에서 hello 수신
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
