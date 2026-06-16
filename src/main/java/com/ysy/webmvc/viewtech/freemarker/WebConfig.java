package com.ysy.webmvc.viewtech.freemarker;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * spring-boot-starter-freemarker 가 FreeMarkerAutoConfiguration 으로 ViewResolver / Config 자동 등록.
 * 기본 location: src/main/resources/templates/<view>.ftlh
 *
 * Boot 는 Thymeleaf 와 FreeMarker 양쪽이 classpath 에 있으면 둘 다 ViewResolver 로 등록. 뷰 이름이
 * 해당 디렉터리에 있는 파일 확장자로 자동 매칭된다.
 */
@Configuration
@ComponentScan(basePackageClasses = FreemarkerController.class)
public class WebConfig {
}
