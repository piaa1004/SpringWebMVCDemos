package com.ysy.webmvc.annotatedcontrollers.handlermethods.matrixvariables;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

/**
 * Annotated Controllers > Handler Methods > Matrix Variables.
 *
 * matrix variable 은 기본적으로 비활성화. UrlPathHelper 의 removeSemicolonContent = false 로 활성.
 */
@Configuration
@ComponentScan(basePackageClasses = MatrixController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper helper = new UrlPathHelper();
        helper.setRemoveSemicolonContent(false);
        configurer.setUrlPathHelper(helper);
    }
}
