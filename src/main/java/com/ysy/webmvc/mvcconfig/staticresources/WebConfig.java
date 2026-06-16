package com.ysy.webmvc.mvcconfig.staticresources;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MVC Config > Static Resources.
 *
 * /files/** 요청을 classpath:/static-demo/ 의 파일로 서비스.
 * cacheControl 과 함께 등록해 클라이언트 캐싱을 지시.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/files/**")
                .addResourceLocations("classpath:/static-demo/")
                .setCacheControl(org.springframework.http.CacheControl.maxAge(java.time.Duration.ofMinutes(5)));
    }
}
