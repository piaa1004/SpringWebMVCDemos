package com.ysy.webmvc.http2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then: curl --http2-prior-knowledge http://localhost:8080/h2/protocol
 * (또는 HTTPS + ALPN 으로 정식 HTTP/2 협상)
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
