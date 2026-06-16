package com.ysy.webmvc.mvcconfig.interceptors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -i http://localhost:8080/admin/dash → X-Tag: admin
 *   curl -i http://localhost:8080/pub/info   → X-Tag: public
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
