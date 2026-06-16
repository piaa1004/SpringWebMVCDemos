package com.ysy.webmvc.dispatcherservlet.exceptions;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
 * DispatcherServlet > Exceptions.
 *
 * 두 가지 흐름을 비교:
 *   1. {@link SimpleMappingExceptionResolver} : 예외 클래스 → 뷰 이름 매핑 (전통적)
 *   2. 직접 구현한 {@link HandlerExceptionResolver}  : 응답 본문/상태 직접 작성 (REST-style)
 */
@Configuration
@ComponentScan(basePackageClasses = ExceptionsController.class)
public class WebConfig {

    @Bean
    public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver r = new SimpleMappingExceptionResolver();
        Properties mapping = new Properties();
        mapping.put(IllegalStateException.class.getName(), "errors/illegal-state");
        r.setExceptionMappings(mapping);
        r.setDefaultStatusCode(500);
        r.setOrder(2);
        return r;
    }

    @Bean
    public HandlerExceptionResolver restExceptionResolver() {
        return (req, res, handler, ex) -> {
            if (ex instanceof IllegalArgumentException) {
                res.setStatus(400);
                res.setContentType("text/plain");
                try {
                    res.getWriter().write("bad-arg: " + ex.getMessage());
                } catch (Exception ignored) {}
                return new org.springframework.web.servlet.ModelAndView();
            }
            return null; // 다음 resolver 위임
        };
    }
}
