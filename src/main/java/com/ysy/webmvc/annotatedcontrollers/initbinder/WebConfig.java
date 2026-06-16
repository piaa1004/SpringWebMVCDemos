package com.ysy.webmvc.annotatedcontrollers.initbinder;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = InitBinderController.class)
public class WebConfig {
}
