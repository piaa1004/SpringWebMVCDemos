package com.ysy.webmvc.annotatedcontrollers.declaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HelloHtmlController.class)
public class WebConfig {
}
