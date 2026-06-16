package com.ysy.webmvc.annotatedcontrollers.handlermethods.multipart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -F "title=hi" -F "file=@README.md" -F "meta={\"tag\":\"x\"};type=application/json" \
 *     http://localhost:8080/multi
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
