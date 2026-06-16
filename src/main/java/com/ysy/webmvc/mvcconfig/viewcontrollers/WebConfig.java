package com.ysy.webmvc.mvcconfig.viewcontrollers;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MVC Config > View Controllers.
 *
 * 컨트롤러 클래스 없이 path → view 직접 매핑. 정적 페이지나 리다이렉트에 유용.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("vc/home");
        registry.addViewController("/health").setStatusCode(HttpStatus.OK);
        registry.addRedirectViewController("/old-path", "/");
    }
}
