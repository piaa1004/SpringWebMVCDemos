package com.ysy.webmvc.annotatedcontrollers.handlermethods.typeconversion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Annotated Controllers > Handler Methods > Type Conversion.
 *
 * - {@code @DateTimeFormat} / {@code @NumberFormat} 은 인자에 직접 부착하는 방식 (컨트롤러에서 시연).
 * - 전역 변환기는 {@code WebMvcConfigurer#addFormatters} 로 등록.
 */
@Configuration
@ComponentScan(basePackageClasses = TypeConversionController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToColorConverter());
    }

    static class StringToColorConverter implements Converter<String, Color> {
        @Override public Color convert(String source) {
            return Color.valueOf(source.toUpperCase());
        }
    }
}
