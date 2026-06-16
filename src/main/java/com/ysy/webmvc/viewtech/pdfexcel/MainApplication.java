package com.ysy.webmvc.viewtech.pdfexcel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl -o out.pdf  http://localhost:8080/doc/pdf
 *   curl -o out.xlsx http://localhost:8080/doc/xlsx
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
