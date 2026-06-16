package com.ysy.webmvc.annotatedcontrollers.exceptions;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = LocalExceptionController.class)
public class WebConfig {
}
