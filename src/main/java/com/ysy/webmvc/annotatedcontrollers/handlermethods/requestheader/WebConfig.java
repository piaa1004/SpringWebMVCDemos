package com.ysy.webmvc.annotatedcontrollers.handlermethods.requestheader;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = RequestHeaderController.class)
public class WebConfig {
}
