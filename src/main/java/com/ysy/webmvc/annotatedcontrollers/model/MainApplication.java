package com.ysy.webmvc.annotatedcontrollers.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then: curl http://localhost:8080/model
 *  → msg / globalNow 가 함께 렌더링됨 ({@code @ModelAttribute} 메서드의 효과).
 *  뷰는 templates/modeldemo/page.html (Thymeleaf).
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
