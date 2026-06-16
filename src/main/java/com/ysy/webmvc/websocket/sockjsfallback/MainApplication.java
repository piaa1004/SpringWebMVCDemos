package com.ysy.webmvc.websocket.sockjsfallback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then 클라이언트가 다음 URL 로 SockJS 접속:
 *   http://localhost:8080/sockjs/echo
 *
 * SockJS info endpoint 확인:
 *   curl http://localhost:8080/sockjs/echo/info
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
