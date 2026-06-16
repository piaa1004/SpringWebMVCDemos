package com.ysy.webmvc.mvcconfig.messageconverters;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MVC Config > Message Converters.
 *
 * - configureMessageConverters : Boot 자동등록 컨버터를 모두 대체. (보통 사용하지 않음)
 * - extendMessageConverters    : 자동등록 컨버터에 추가/제거. ↓ 본 토픽이 시연하는 방법.
 */
@Configuration
@ComponentScan(basePackageClasses = MessageConvertersController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        // 첫 번째 자리에 text/csv 를 다루는 StringHttpMessageConverter 변형 추가
        StringHttpMessageConverter csv = new StringHttpMessageConverter();
        csv.setSupportedMediaTypes(List.of(new MediaType("text", "csv")));
        converters.add(0, csv);
    }
}
