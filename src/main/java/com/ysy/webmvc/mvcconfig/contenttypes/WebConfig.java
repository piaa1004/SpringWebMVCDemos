package com.ysy.webmvc.mvcconfig.contenttypes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MVC Config > Content Types.
 * 파라미터 ?format=xml 으로도 media type 협상 가능하게 한다.
 */
@Configuration
@ComponentScan(basePackageClasses = ContentTypesController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorParameter(true)
                  .parameterName("format")
                  .ignoreAcceptHeader(false)
                  .defaultContentType(MediaType.APPLICATION_JSON)
                  .mediaType("xml", MediaType.APPLICATION_XML)
                  .mediaType("json", MediaType.APPLICATION_JSON);
    }
}
