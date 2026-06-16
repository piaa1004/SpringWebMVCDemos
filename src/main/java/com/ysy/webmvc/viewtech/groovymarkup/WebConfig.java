package com.ysy.webmvc.viewtech.groovymarkup;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Groovy Markup Templates.
 * spring-boot-starter-groovy-templates 자동 구성.
 * 기본 location: src/main/resources/templates/<view>.tpl
 */
@Configuration
@ComponentScan(basePackageClasses = GroovyController.class)
public class WebConfig {
}
