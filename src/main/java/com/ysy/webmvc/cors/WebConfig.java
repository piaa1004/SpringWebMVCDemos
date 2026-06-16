package com.ysy.webmvc.cors;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * CORS — 전역 정책 + 메서드/클래스 레벨 {@code @CrossOrigin} 두 가지 방법을 함께 시연.
 */
@Configuration
@ComponentScan(basePackageClasses = CorsController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("http://app.example.com")
                .allowedMethods("GET", "POST")
                .maxAge(3600);
    }
}
