package com.ysy.webmvc.dispatcherservlet.pathmatching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/users/42
 *   curl http://localhost:8080/letters/abc
 *   curl http://localhost:8080/letters/Abc      (404 — 대문자 미매칭)
 *   curl http://localhost:8080/files/a/b/c.txt
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
