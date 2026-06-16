package com.ysy.webmvc.databinding;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = DataBindingController.class)
public class WebConfig {
}
