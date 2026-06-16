package com.ysy.webmvc.versioning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * API Versioning.
 *
 * Spring Framework 7.0 에서 도입될 {@code ApiVersionConfigurer} / {@code @GetMapping(version=...)} 가
 * 현재 사용 중인 6.2.x 라인에는 아직 없어, 같은 효과를 표준 {@code headers} 조건으로 시연한다.
 * 컨트롤러는 "X-API-Version" 헤더 값으로 분기.
 */
@Configuration
@ComponentScan(basePackageClasses = VersionedController.class)
public class WebConfig {
}
