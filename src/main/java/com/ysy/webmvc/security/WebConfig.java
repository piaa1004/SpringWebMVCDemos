package com.ysy.webmvc.security;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Web Security — Spring Security 별도 모듈 의존성이 필요한 본격 토픽이므로,
 * 여기서는 Spring 문서가 언급하는 "Web Security" 의 위치만 보여준다.
 *
 * 본 데모는 Spring Security 의존성을 추가하지 않고, 컨트롤러에서 직접 Authorization 헤더를
 * 검사하는 토이 패턴을 시연. 실제 프로젝트에서는 spring-boot-starter-security 를 추가하고
 * SecurityFilterChain 빈으로 구성한다.
 */
@Configuration
@ComponentScan(basePackageClasses = SecurityController.class)
public class WebConfig {
}
