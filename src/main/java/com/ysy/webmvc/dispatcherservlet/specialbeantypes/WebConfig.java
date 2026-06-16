package com.ysy.webmvc.dispatcherservlet.specialbeantypes;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ThemeResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.support.SessionFlashMapManager;
import org.springframework.web.servlet.theme.FixedThemeResolver;
import org.springframework.web.servlet.view.BeanNameViewResolver;

/**
 * DispatcherServlet > Special Bean Types.
 *
 * Spring docs 가 열거한 DispatcherServlet 의 "special bean types" 슬롯에 직접 빈을 채워본다.
 * (HandlerMapping / HandlerAdapter 는 @EnableWebMvc 가 자동 등록하므로 생략.)
 *
 * 빈 종류:
 *   - LocaleResolver, ThemeResolver, ViewResolver, MultipartResolver,
 *     FlashMapManager, HandlerExceptionResolver
 */
@Configuration
@ComponentScan(basePackageClasses = SpecialBeansController.class)
public class WebConfig {

    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver r = new AcceptHeaderLocaleResolver();
        r.setDefaultLocale(Locale.KOREA);
        return r;
    }

    @Bean
    public ThemeResolver themeResolver() {
        FixedThemeResolver r = new FixedThemeResolver();
        r.setDefaultThemeName("light");
        return r;
    }

    @Bean
    public ViewResolver beanNameViewResolver() {
        return new BeanNameViewResolver();
    }

    @Bean
    public StandardServletMultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }

    @Bean
    public SessionFlashMapManager flashMapManager() {
        return new SessionFlashMapManager();
    }

    @Bean
    public HandlerExceptionResolver loggingExceptionResolver() {
        return (request, response, handler, ex) -> {
            System.err.println("[loggingExceptionResolver] " + ex);
            return null; // 다음 resolver 에 위임
        };
    }
}
