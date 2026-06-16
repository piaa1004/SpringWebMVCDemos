package com.ysy.webmvc.rangerequests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -i http://localhost:8080/range/alphabet                      → 200 1024 bytes
 *   curl -i -H "Range: bytes=0-9"   http://localhost:8080/range/alphabet → 206 처음 10바이트
 *   curl -i -H "Range: bytes=-26"   http://localhost:8080/range/alphabet → 206 마지막 26바이트
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
