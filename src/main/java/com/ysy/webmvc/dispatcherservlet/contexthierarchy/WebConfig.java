package com.ysy.webmvc.dispatcherservlet.contexthierarchy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * DispatcherServlet 의 web ApplicationContext.
 * 이 컨텍스트는 controller / view-resolver / handler-mapping 같은 web-tier 빈만 담는다.
 * root 컨텍스트에 등록된 {@link GreetingService} 는 자식인 이 컨텍스트의 컨트롤러에서 주입 가능.
 */
@Configuration
@ComponentScan(basePackageClasses = HelloController.class)
public class WebConfig {
}
