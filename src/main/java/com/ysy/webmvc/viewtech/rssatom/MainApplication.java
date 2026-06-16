package com.ysy.webmvc.viewtech.rssatom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/feed/rss
 *   curl http://localhost:8080/feed/atom
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
