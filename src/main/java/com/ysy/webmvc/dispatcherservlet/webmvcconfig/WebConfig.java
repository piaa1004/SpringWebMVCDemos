package com.ysy.webmvc.dispatcherservlet.webmvcconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * DispatcherServlet > Web MVC Config.
 *
 * 한 컨트롤러가 어떻게 {@link WebMvcConfigurer} 의 "확장 슬롯" 을 통해 MVC 기본 동작을
 * 커스터마이즈하는지 보여주는 최소 데모.
 *  - addViewControllers : /home 경로를 ViewController 로 노출
 *  - addInterceptors    : 모든 요청에 로깅 인터셉터 부착
 */
@Configuration
@ComponentScan(basePackageClasses = PingController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setStatusCode(org.springframework.http.HttpStatus.OK);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoggingInterceptor());
    }
}
