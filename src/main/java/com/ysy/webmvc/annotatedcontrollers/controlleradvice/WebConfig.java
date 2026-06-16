package com.ysy.webmvc.annotatedcontrollers.controlleradvice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AdvisedController.class)
public class WebConfig {
}
