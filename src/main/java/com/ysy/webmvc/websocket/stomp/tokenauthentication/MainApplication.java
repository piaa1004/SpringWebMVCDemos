package com.ysy.webmvc.websocket.stomp.tokenauthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Run, then CONNECT 프레임에 native header "Authorization: Bearer abc" 포함. */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
