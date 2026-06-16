package com.ysy.webmvc.caching;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = CachingController.class)
public class WebConfig {
}
