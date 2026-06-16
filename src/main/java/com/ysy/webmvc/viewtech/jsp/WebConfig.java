package com.ysy.webmvc.viewtech.jsp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * JSP and JSTL.
 *
 * Spring Boot jar 패키징에서는 JSP 가 동작하지 않는다(실행 가능 jar 안의 JSP 를 Tomcat 이 컴파일할 수 없음).
 * JSP 를 쓰려면 packaging 을 war 로 바꾸고 다음 의존성을 추가:
 *   - org.apache.tomcat.embed:tomcat-embed-jasper (provided)
 *   - jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api
 *
 * 본 데모는 그 환경 차이를 가시화하기 위한 placeholder. 컨트롤러는 view name 만 반환하지만
 * 현재 패키징에서는 ViewResolver 에 매칭되는 JSP 가 없어 404 발생.
 */
@Configuration
@ComponentScan(basePackageClasses = JspController.class)
public class WebConfig {
}
