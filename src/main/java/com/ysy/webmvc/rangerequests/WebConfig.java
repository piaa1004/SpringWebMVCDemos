package com.ysy.webmvc.rangerequests;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = RangeController.class)
public class WebConfig {
}
