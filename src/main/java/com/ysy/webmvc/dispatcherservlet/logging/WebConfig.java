package com.ysy.webmvc.dispatcherservlet.logging;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

/**
 * DispatcherServlet > Logging.
 *
 * Spring 제공 {@link CommonsRequestLoggingFilter} 를 빈으로 노출. 일반 WAR 환경에서는
 * web.xml / WebApplicationInitializer 로 filter 등록. 본 데모에서는
 * {@link MainApplication} 이 ServletContext 에 직접 filter 를 추가한다.
 */
@Configuration
@ComponentScan(basePackageClasses = LogController.class)
public class WebConfig {

    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter() {
        CommonsRequestLoggingFilter f = new CommonsRequestLoggingFilter();
        f.setIncludeQueryString(true);
        f.setIncludePayload(true);
        f.setIncludeHeaders(false);
        f.setBeforeMessagePrefix("REQ-BEFORE: ");
        f.setAfterMessagePrefix("REQ-AFTER: ");
        return f;
    }
}
