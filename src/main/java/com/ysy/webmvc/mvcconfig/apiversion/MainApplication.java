package com.ysy.webmvc.mvcconfig.apiversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl "http://localhost:8080/widgets?v=1"
 *   curl "http://localhost:8080/widgets?v=2"
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
