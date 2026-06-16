package com.ysy.webmvc.websocket.stomp.externalbroker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Run — 단, localhost:61613 STOMP broker 가 떠있지 않으면 relay 가 실패한다. */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
