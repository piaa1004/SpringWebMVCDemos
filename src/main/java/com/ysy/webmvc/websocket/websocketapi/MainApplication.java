package com.ysy.webmvc.websocket.websocketapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then (wscat 또는 websocat):
 *   wscat -c ws://localhost:8080/ws/echo
 *   > hello
 *   < echo:hello
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
