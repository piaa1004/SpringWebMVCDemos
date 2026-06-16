package com.ysy.webmvc.mvcconfig.interceptors;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MVC Config > Interceptors.
 * 두 개의 인터셉터를 각기 다른 path pattern 에 매핑.
 */
@Configuration
@ComponentScan(basePackageClasses = InterceptorsController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TagInterceptor("admin")).addPathPatterns("/admin/**");
        registry.addInterceptor(new TagInterceptor("public")).addPathPatterns("/pub/**");
    }
}
