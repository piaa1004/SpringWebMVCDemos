package com.ysy.webmvc.mvcconfig.pathmatching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/api/things    → ok
 *   curl -i http://localhost:8080/things     → 404 (prefix 적용으로 원본 path 사라짐)
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
