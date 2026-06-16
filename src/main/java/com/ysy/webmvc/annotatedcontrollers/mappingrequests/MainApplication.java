package com.ysy.webmvc.annotatedcontrollers.mappingrequests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/items
 *   curl http://localhost:8080/items/42
 *   curl -X POST -H "Content-Type: application/json" -d '{}' http://localhost:8080/items
 *   curl -X PUT  -H "X-Tenant: acme" http://localhost:8080/items/42
 *   curl -X DELETE "http://localhost:8080/items/42?force=true"
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
