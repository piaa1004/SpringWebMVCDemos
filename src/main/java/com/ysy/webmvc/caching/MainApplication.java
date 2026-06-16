package com.ysy.webmvc.caching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -i http://localhost:8080/cache/cc                              → Cache-Control 헤더 확인
 *   curl -i http://localhost:8080/cache/cond                            → 200 + ETag
 *   curl -i -H 'If-None-Match: "v1"' http://localhost:8080/cache/cond   → 304 Not Modified
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
