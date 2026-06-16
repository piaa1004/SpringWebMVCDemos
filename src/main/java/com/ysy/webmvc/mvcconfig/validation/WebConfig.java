package com.ysy.webmvc.mvcconfig.validation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MVC Config > Validation.
 * {@link WebMvcConfigurer#getValidator} 로 전역 Validator 교체.
 */
@Configuration
@ComponentScan(basePackageClasses = ValidationController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public Validator getValidator() {
        return new Validator() {
            @Override public boolean supports(Class<?> clazz) { return Booking.class.equals(clazz); }
            @Override public void validate(Object target, Errors errors) {
                Booking b = (Booking) target;
                if (b.guestName == null || b.guestName.isBlank()) {
                    errors.rejectValue("guestName", "blank");
                }
            }
        };
    }
}
