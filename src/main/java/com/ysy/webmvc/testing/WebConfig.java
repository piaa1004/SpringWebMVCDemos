package com.ysy.webmvc.testing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Testing — Spring MVC Test (MockMvc) 의 위치를 알리기 위한 패키지.
 * 실제 테스트 코드는 src/test/java 에 둔다 (TestingControllerTests.java 참조).
 */
@Configuration
@ComponentScan(basePackageClasses = TestingController.class)
public class WebConfig {
}
