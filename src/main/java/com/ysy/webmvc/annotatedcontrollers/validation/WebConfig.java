package com.ysy.webmvc.annotatedcontrollers.validation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = ValidationController.class)
public class WebConfig {
}
