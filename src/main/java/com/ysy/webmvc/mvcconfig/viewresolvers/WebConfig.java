package com.ysy.webmvc.mvcconfig.viewresolvers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MVC Config > View Resolvers.
 *
 * {@link ViewResolverRegistry} 로 view resolver 를 등록 (jsp(), bean(), beanName() 등).
 * Boot 자동구성과 함께 동작 시 등록된 resolver 는 chain 의 일부가 된다.
 */
@Configuration
@ComponentScan(basePackageClasses = ViewResolversController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.beanName();                  // BeanNameViewResolver
        registry.jsp("/WEB-INF/views/", ".jsp"); // (jar 환경에서는 미동작)
    }
}
