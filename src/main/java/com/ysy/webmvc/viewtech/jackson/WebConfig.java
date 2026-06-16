package com.ysy.webmvc.viewtech.jackson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import org.springframework.web.servlet.view.xml.MappingJackson2XmlView;

/**
 * Jackson view — JSON 과 XML 을 같은 모델에서 렌더링.
 * MappingJackson2JsonView 와 MappingJackson2XmlView 모두 모델 → 직렬화.
 */
@Configuration
@ComponentScan(basePackageClasses = JacksonViewController.class)
public class WebConfig {

    @Bean
    public View jacksonJsonView() {
        return new MappingJackson2JsonView();
    }

    @Bean
    public View jacksonXmlView() {
        return new MappingJackson2XmlView();
    }
}
