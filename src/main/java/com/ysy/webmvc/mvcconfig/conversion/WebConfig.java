package com.ysy.webmvc.mvcconfig.conversion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MVC Config > Type Conversion.
 * addFormatters 에 사용자 정의 Converter/Formatter 등록.
 */
@Configuration
@ComponentScan(basePackageClasses = MoneyController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToMoneyConverter());
    }

    static class StringToMoneyConverter implements Converter<String, Money> {
        @Override public Money convert(String s) {
            // "USD 12.50" → Money("USD", 12.50)
            String[] parts = s.split(" ");
            return new Money(parts[0], Double.parseDouble(parts[1]));
        }
    }
}
