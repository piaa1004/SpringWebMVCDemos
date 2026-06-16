package com.ysy.webmvc.annotatedcontrollers.mappingrequests;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = MappingsController.class)
public class WebConfig {
}
