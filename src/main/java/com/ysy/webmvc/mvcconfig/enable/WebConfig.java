package com.ysy.webmvc.mvcconfig.enable;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * MVC Config > Enable MVC Configuration.
 *
 * {@code @EnableWebMvc} 는 MVC infrastructure 빈을 명시적으로 활성화한다.
 * Spring Boot 에서 이 어노테이션을 붙이면 WebMvcAutoConfiguration 이 backed off 되어
 * Jackson/Thymeleaf 자동 구성도 영향을 받는다는 점에 주의.
 *
 * 본 토픽은 어노테이션이 실제 활성화하는 동작 (RequestMappingHandlerMapping 등) 을
 * 확인하기 위한 용도. 다른 토픽들은 모두 어노테이션을 떼고 Boot 자동구성을 사용한다.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = EnableController.class)
public class WebConfig {
}
