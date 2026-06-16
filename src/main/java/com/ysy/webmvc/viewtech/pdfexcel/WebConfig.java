package com.ysy.webmvc.viewtech.pdfexcel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;

/**
 * PDF and Excel — Spring 의 AbstractPdfView (OpenPDF) / AbstractXlsxView (Apache POI) 활용.
 *
 * 빈 이름이 view name 과 일치하면 BeanNameViewResolver 가 매칭.
 */
@Configuration
@ComponentScan(basePackageClasses = DocumentController.class)
public class WebConfig {

    @Bean
    public View pdfView() {
        return new SamplePdfView();
    }

    @Bean
    public View xlsxView() {
        return new SampleXlsxView();
    }
}
