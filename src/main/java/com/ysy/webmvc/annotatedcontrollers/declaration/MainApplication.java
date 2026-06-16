package com.ysy.webmvc.annotatedcontrollers.declaration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/hello-html → "<h1>hello from @Controller</h1>"
 *   curl http://localhost:8080/hello-rest → "hello from @RestController"
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
