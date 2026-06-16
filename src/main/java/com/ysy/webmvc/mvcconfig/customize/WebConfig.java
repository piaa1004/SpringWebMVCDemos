package com.ysy.webmvc.mvcconfig.customize;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * MVC Config > MVC Config API.
 *
 * {@link WebMvcConfigurer} 의 콜백 메서드들이 MVC 의 기본 동작을 커스터마이즈하는 "확장 슬롯".
 * 여기서는 가장 단순한 hook (addInterceptors) 만 보여준다.
 */
@Configuration
@ComponentScan(basePackageClasses = HelloController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptor() {
            @Override public boolean preHandle(HttpServletRequest r, HttpServletResponse s, Object h) {
                r.setAttribute("hookedBy", "WebMvcConfigurer.addInterceptors");
                return true;
            }
        });
    }
}
