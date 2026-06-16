package com.ysy.webmvc.annotatedcontrollers.handlermethods.matrixvariables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Run, then: curl "http://localhost:8080/cars/123;color=red;year=2024" */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
