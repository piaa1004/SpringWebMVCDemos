package com.ysy.webmvc.mvcconfig.defaultservlet;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MVC Config > Default Servlet Handler.
 *
 * DispatcherServlet 이 "/" 에 매핑된 경우, 정적 자원 요청이 컨테이너의 default servlet 으로 가지 못한다.
 * {@link DefaultServletHandlerConfigurer#enable} 로 unmatched 요청을 다시 default servlet 에 forward.
 */
@Configuration
@ComponentScan(basePackageClasses = HelloController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
