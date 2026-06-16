package com.ysy.webmvc.websocket.stomp.userdestinations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Run, then STOMP 클라이언트가 SUBSCRIBE /user/queue/replies → SEND /app/me. */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
