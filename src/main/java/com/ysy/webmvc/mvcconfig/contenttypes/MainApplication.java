package com.ysy.webmvc.mvcconfig.contenttypes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/hi                  → JSON
 *   curl "http://localhost:8080/hi?format=xml"     → XML (jackson-dataformat-xml)
 *   curl -H "Accept: application/xml" http://localhost:8080/hi → XML
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
