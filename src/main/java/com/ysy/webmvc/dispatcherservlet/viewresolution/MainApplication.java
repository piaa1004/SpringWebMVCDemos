package com.ysy.webmvc.dispatcherservlet.viewresolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/json   → {"name":"spring","year":2025}
 *   curl http://localhost:8080/html   → Thymeleaf 템플릿(templates/html/hello.html) 렌더링 결과
 *
 * BeanNameViewResolver 가 "jsonView" 빈 이름과 매칭되고, 그 외 뷰 이름은 Boot 자동 등록 ThymeleafViewResolver 가 처리.
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
