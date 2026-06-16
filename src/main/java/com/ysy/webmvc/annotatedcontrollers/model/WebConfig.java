package com.ysy.webmvc.annotatedcontrollers.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Boot 가 ThymeleafAutoConfiguration 으로 ViewResolver / TemplateEngine 을 자동 등록하므로
 * 별도 ViewResolver 빈을 둘 필요 없음. 뷰 이름은 templates/<view>.html 로 매핑된다.
 */
@Configuration
@ComponentScan(basePackageClasses = ModelDemoController.class)
public class WebConfig {
}
