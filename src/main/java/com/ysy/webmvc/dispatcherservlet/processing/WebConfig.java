package com.ysy.webmvc.dispatcherservlet.processing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * DispatcherServlet > Processing.
 *
 * 한 요청이 DispatcherServlet 을 통과할 때 거치는 순서를 가시화하기 위해
 * preHandle → controller → postHandle → afterCompletion 를 모두 로깅하는 인터셉터를 단다.
 */
@Configuration
@ComponentScan(basePackageClasses = OrderController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SequenceInterceptor("A"));
        registry.addInterceptor(new SequenceInterceptor("B"));
    }
}
