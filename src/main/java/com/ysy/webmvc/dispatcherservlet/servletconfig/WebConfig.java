package com.ysy.webmvc.dispatcherservlet.servletconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = ConfigController.class)
public class WebConfig {
}
