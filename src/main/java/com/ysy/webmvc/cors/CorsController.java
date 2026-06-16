package com.ysy.webmvc.cors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsController {

    /** 전역 CORS 매핑 적용 (allowedOrigins=app.example.com). */
    @GetMapping("/api/items")
    public String items() {
        return "items";
    }

    /** 메서드 레벨 @CrossOrigin 으로 별도 정책. */
    @CrossOrigin(origins = "*")
    @GetMapping("/widgets")
    public String widgets() {
        return "widgets";
    }
}
