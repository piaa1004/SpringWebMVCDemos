package com.ysy.webmvc.cors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then (CORS preflight):
 *   curl -i -X OPTIONS -H "Origin: http://app.example.com" \
 *     -H "Access-Control-Request-Method: GET" http://localhost:8080/api/items
 *   curl -i -X OPTIONS -H "Origin: http://other.com" \
 *     -H "Access-Control-Request-Method: GET" http://localhost:8080/api/items  → 403
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
