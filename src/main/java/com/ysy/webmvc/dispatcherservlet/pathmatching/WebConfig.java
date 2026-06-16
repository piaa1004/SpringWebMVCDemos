package com.ysy.webmvc.dispatcherservlet.pathmatching;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * DispatcherServlet > Path Matching.
 *
 * Spring 6+ 는 기본적으로 {@code PathPatternParser} 를 사용. 컨트롤러에서 다음 패턴이
 * 어떻게 매칭되는지 보여준다:
 *   - {var}, {*paths}, {var:[a-z]+}
 *   - GET /a/b/c → /a/{*paths} 매칭
 */
@Configuration
@ComponentScan(basePackageClasses = PathController.class)
public class WebConfig {
}
