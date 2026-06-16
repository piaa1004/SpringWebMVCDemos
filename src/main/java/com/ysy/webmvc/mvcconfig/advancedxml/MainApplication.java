package com.ysy.webmvc.mvcconfig.advancedxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Run, then: curl http://localhost:8080/ax/info  /  curl http://localhost:8080/xc/home */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
