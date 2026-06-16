package com.ysy.webmvc.dispatcherservlet.viewresolution;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * DispatcherServlet > View Resolution.
 *
 * 두 종류의 ViewResolver 가 chain 으로 동작:
 *   - BeanNameViewResolver (order 0) : 뷰 이름 == 빈 이름이면 해당 View 빈을 사용 (예: jsonView)
 *   - ThymeleafViewResolver          : Spring Boot 가 spring-boot-starter-thymeleaf 로 자동 등록
 *                                      → templates/<view>.html 를 렌더
 *
 * 컨트롤러는 view name = "jsonView" 또는 "html/hello" 를 반환해 둘 다 시연.
 */
@Configuration
@ComponentScan(basePackageClasses = ViewController.class)
public class WebConfig {

    @Bean
    public ViewResolver beanNameViewResolver() {
        BeanNameViewResolver r = new BeanNameViewResolver();
        r.setOrder(0);
        return r;
    }

    @Bean
    public View jsonView() {
        return new MappingJackson2JsonView();
    }
}
