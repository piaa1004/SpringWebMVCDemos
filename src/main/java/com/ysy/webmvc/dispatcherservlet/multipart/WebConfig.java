package com.ysy.webmvc.dispatcherservlet.multipart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

/**
 * DispatcherServlet > Multipart Resolver.
 *
 * Servlet 3.0+ 의 표준 multipart parsing 을 사용. 빈 이름은 반드시 "multipartResolver".
 * (Tomcat 측 multipart-config 등록은 DispatcherServlet 등록부에서 처리해야 하지만,
 * 본 데모에서는 ServletRegistration 의 multipart-config 를 EmbeddedTomcatRunner 가 일괄 적용한다.
 * 데모 컨트롤러에서는 @RequestParam("file") MultipartFile 로 받음.)
 */
@Configuration
@ComponentScan(basePackageClasses = UploadController.class)
public class WebConfig {

    @Bean(name = "multipartResolver")
    public MultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }
}
