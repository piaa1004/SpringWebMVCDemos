package com.ysy.webmvc.dispatcherservlet.interception;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * DispatcherServlet > Interception.
 *
 * HandlerInterceptor 를 path pattern 으로 매핑 / 제외하는 방법.
 */
@Configuration
@ComponentScan(basePackageClasses = InterceptedController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ApiKeyInterceptor())
                .addPathPatterns("/api/**")
                .excludePathPatterns("/api/public/**");
    }
}
