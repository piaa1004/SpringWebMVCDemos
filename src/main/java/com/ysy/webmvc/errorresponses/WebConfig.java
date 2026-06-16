package com.ysy.webmvc.errorresponses;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = ErrorResponsesController.class)
public class WebConfig {
}
