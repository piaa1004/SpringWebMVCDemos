package com.ysy.webmvc.mvcconfig.pathmatching;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MVC Config > Path Matching.
 *
 * - addPathPrefix : 특정 컨트롤러 그룹에 공통 prefix 부여.
 * - PathPatternParser 가 기본, 별도 설정 없음.
 */
@Configuration
@ComponentScan(basePackageClasses = ApiController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.addPathPrefix("/api",
                c -> c.isAnnotationPresent(org.springframework.web.bind.annotation.RestController.class));
    }
}
