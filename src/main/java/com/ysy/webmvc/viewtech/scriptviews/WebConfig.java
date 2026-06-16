package com.ysy.webmvc.viewtech.scriptviews;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Script Views.
 *
 * Spring MVC 는 JSR-223 호환 ScriptEngine 을 통해 JavaScript / Kotlin / Ruby / Mustache 등을
 * view 로 쓸 수 있다. {@link ViewResolverRegistry#scriptTemplate} 로 등록.
 *
 * Java 17 환경에서는 Nashorn 이 제거되었으므로 GraalVM polyglot 또는 별도 script engine 의존성이 필요.
 * 본 데모에서는 등록 코드만 보여주고 실제 렌더는 의존성 추가 후 동작.
 */
@Configuration
@ComponentScan(basePackageClasses = ScriptViewController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        // registry.scriptTemplate(); // 의존성 추가 시 활성화
    }
}
