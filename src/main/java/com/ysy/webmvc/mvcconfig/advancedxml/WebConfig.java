package com.ysy.webmvc.mvcconfig.advancedxml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * MVC Config > Advanced XML Config.
 *
 * Spring 의 XML 기반 MVC namespace (mvc:annotation-driven 등) 를 사용하는 패턴.
 * Boot 환경에서도 ImportResource 로 XML 설정 파일을 불러올 수 있다.
 */
@Configuration
@ComponentScan(basePackageClasses = AdvancedXmlController.class)
@ImportResource("classpath:advanced-xml/mvc.xml")
public class WebConfig {
}
