package com.ysy.webmvc.annotatedcontrollers.handlermethods.requestattribute;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackageClasses = RequestAttributeController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 인터셉터가 request attribute 를 세팅 → 컨트롤러가 @RequestAttribute 로 받음
        registry.addInterceptor(new RequestIdInterceptor());
    }
}
