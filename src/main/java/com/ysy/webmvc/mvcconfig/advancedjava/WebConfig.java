package com.ysy.webmvc.mvcconfig.advancedjava;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;

/**
 * MVC Config > Advanced Java Config.
 *
 * MVC infrastructure 의 어떤 빈을 완전히 교체하려면 {@link DelegatingWebMvcConfiguration} 을
 * 상속해 그 protected 메서드를 override 한다. 이 방법은 @EnableWebMvc 보다 더 깊은 수준의 커스터마이즈.
 *
 * 본 데모는 그 방법의 entry point 를 보여주는 minimal 예시 — 실제로는 빈을 교체하지 않는다.
 */
@Configuration
@ComponentScan(basePackageClasses = AdvancedJavaController.class)
public class WebConfig extends DelegatingWebMvcConfiguration {
    // 예) override protected RequestMappingHandlerMapping createRequestMappingHandlerMapping() {...}
}
