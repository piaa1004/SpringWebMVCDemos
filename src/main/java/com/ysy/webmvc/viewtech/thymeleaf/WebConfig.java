package com.ysy.webmvc.viewtech.thymeleaf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * View Technologies > Thymeleaf.
 *
 * spring-boot-starter-thymeleaf 가 ThymeleafAutoConfiguration 으로 모든 빈을 자동 구성.
 * 컨트롤러는 view name 만 반환하면 templates/<view>.html 이 렌더된다.
 */
@Configuration
@ComponentScan(basePackageClasses = ThymeleafController.class)
public class WebConfig {
}
