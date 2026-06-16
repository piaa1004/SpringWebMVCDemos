package com.ysy.webmvc.mvcconfig.apiversion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * MVC Config > API Version.
 *
 * 문서가 별도 챕터로 두고 있어 패키지를 분리. {@code ApiVersionConfigurer} 는 Spring 7.0 신규 API 이므로
 * 6.2.x 호환을 위해 컨트롤러에서 {@code params} 조건으로 버전을 분기.
 */
@Configuration
@ComponentScan(basePackageClasses = ApiVersionController.class)
public class WebConfig {
}
