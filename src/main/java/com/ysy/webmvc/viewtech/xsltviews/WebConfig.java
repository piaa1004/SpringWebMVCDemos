package com.ysy.webmvc.viewtech.xsltviews;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.xslt.XsltViewResolver;

/**
 * XSLT Views — XML source + XSLT stylesheet 로 변환.
 * src/main/resources/xslt/people.xsl 가 stylesheet.
 */
@Configuration
@ComponentScan(basePackageClasses = XsltController.class)
public class WebConfig {

    @Bean
    public XsltViewResolver xsltViewResolver() {
        XsltViewResolver r = new XsltViewResolver();
        r.setPrefix("xslt/");
        r.setSuffix(".xsl");
        r.setSourceKey("data");
        return r;
    }
}
