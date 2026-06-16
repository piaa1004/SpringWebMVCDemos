package com.ysy.webmvc.viewtech.htmlfragments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/frag/full   → 전체 페이지
 *   curl http://localhost:8080/frag/list   → <ul> ... </ul> 단편만
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
